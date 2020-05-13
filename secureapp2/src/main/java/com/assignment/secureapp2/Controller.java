package com.assignment.secureapp2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/publicinfo")
    public String getPublicInfo() {
        return "This is public info";
    }
    @GetMapping("/employee")
    public ResponseEntity<Employee> getEmployeeInfo() {
        return new ResponseEntity<>(new Employee("Bishwas","987654321","Dearborn"), HttpStatus.OK);
    }
}
