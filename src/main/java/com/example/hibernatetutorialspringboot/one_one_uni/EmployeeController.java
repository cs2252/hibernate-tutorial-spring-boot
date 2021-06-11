package com.example.hibernatetutorialspringboot.one_one_uni;


import com.example.hibernatetutorialspringboot.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("employeeControllerOneToOneUni")
@RequestMapping("/onetooneuni")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

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
