package com.assignment.secureapp2;

import java.util.Objects;

public class Employee {
    private String name;
    private String phone;
    private String address;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                phone.equals(employee.phone) &&
                address.equals(employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
}
