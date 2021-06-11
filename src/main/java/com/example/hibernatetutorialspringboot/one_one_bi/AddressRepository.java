package com.example.hibernatetutorialspringboot.one_one_bi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("addressRepositoryOneToOneBi")
public interface AddressRepository extends JpaRepository<Address,Long> {
}
