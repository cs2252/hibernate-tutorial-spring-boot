package com.example.hibernatetutorialspringboot.one_many_uni;

import com.example.hibernatetutorialspringboot.exception.AddressNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("addressControllerOneToManyUni")
@RequestMapping("/onetomanyuni")
public class AddressController {

    private AddressRepository addressRepository;

    public AddressController(AddressRepository addressRepository){
        this.addressRepository=addressRepository;
    }

    @GetMapping("/address")
    public List<Address> findAll(){
        return addressRepository.findAll();
    }
    @GetMapping("/address/{addressId}")
    public Address findById(@PathVariable Long addressId){
        Optional<Address> addressOptional=addressRepository.findById(addressId);
        if(addressOptional.isEmpty())
            throw new AddressNotFoundException("Address not found with id : "+addressId);
        return addressOptional.get();
    }

    @PostMapping("/address")
    public Address save(@RequestBody Address address){
        return addressRepository.save(address);
    }

    @PutMapping("/address")
    public Address update(@RequestBody Address address){
        Optional<Address> addressOptional=addressRepository.findById(address.getAddressId());
        if(addressOptional.isEmpty())
            throw new AddressNotFoundException("Address not found with id : "+address.getAddressId());
        return addressRepository.save(address);
    }
    @DeleteMapping("/address/{addressId}")
    public void delete(@PathVariable Long addressId){
        addressRepository.deleteById(addressId);
    }
}
