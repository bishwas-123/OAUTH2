package com.assignment.secureapp3;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/salarydata")
    public ResponseEntity<SalaryData> getSalaryData(){
        return new ResponseEntity<>(new SalaryData("$12340.0"),HttpStatus.OK);

    }
}
