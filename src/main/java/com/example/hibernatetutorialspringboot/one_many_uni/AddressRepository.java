package com.example.hibernatetutorialspringboot.one_many_uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("addressRepositoryToManyUni")
public interface AddressRepository extends JpaRepository<Address,Long> {
}
