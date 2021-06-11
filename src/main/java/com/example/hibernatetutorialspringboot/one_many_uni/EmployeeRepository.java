package com.example.hibernatetutorialspringboot.one_many_uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("employeeRepositoryOneToManyUni")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
