package com.example.hibernatetutorialspringboot.one_one_bi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("employeeRepositoryOneToOneBi")

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
