package com.example.hibernatetutorialspringboot.one_one_uni;

import javax.persistence.*;

@Entity(name="employeeOneToOneUni")
@Table(name = "employee_one_to_one_uni")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long employeeId;

    private String name;

    private int age;
    @OneToOne(targetEntity = Address.class,cascade = CascadeType.ALL)
//    @JoinColumn(name="address_Id",referencedColumnName = "id")
    private Address address;

    public Employee() {
    }

    public Employee(long employeeId, String name, int age, Address address) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
