package com.example.hibernatetutorialspringboot.one_one_uni;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("addressRepositoryOneToOneUni")
public interface AddressRepository extends JpaRepository<Address,Long> {
}
