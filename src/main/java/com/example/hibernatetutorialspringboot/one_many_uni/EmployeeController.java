package com.example.hibernatetutorialspringboot.one_many_uni;


import com.example.hibernatetutorialspringboot.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("employeeControllerOneToManyUni")
@RequestMapping("/onetomanyuni")
public class EmployeeController {

    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee findById(@PathVariable Long employeeId){
        Optional<Employee> employeeOptional=employeeRepository.findById(employeeId);
        if(!employeeOptional.isPresent())
            throw new EmployeeNotFoundException("Employee not found with id : "+employeeId);
        return employeeOptional.get();
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee){
        List<Address> addressList=employee.getAddressList();
        employee.setAddressList(null);
        Employee savedEmployee= employeeRepository.save(employee);
        addressList.stream()
                .forEach(address -> {
                    address.setEmployeeId(savedEmployee.getEmployeeId());
                    addressRepository.save(address);
                });
        return employeeRepository.save(employee);
    }

    @PutMapping("/employee")
    public Employee update(@RequestBody Employee employee){
        Optional<Employee> employeeOptional=employeeRepository.findById(employee.getEmployeeId());
        if(!employeeOptional.isPresent())
            throw new EmployeeNotFoundException("Employee not found with id : "+employee.getEmployeeId());

        return employeeRepository.save(employee);
    }

    @DeleteMapping("/employee/{employeeId}")
    public void delete(@PathVariable Long employeeId){
        employeeRepository.deleteById(employeeId);
    }

}
