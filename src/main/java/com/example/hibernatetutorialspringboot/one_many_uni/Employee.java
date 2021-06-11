package com.example.hibernatetutorialspringboot.one_many_uni;

import javax.persistence.*;
import java.util.List;

@Entity(name="employeeOneToManyUni")
@Table(name = "employee_one_to_many_uni")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long employeeId;

    private String name;

    private int age;
    @OneToMany()
//    @JoinColumn(name="address_Id",referencedColumnName = "id")
    private List<Address> addressList;

    public Employee() {
    }

    public Employee(long employeeId, String name, int age, List<Address> addressList) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.addressList = addressList;
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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
