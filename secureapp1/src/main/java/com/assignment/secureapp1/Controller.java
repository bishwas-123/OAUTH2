package com.assignment.secureapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    OAuth2RestTemplate restTemplate;
    @GetMapping("/productdata")
    public ResponseEntity<Product> getproductData() {
        return new ResponseEntity<>(new Product("Noodles","12400","This is noodles"), HttpStatus.OK);
    }
    @GetMapping("/employeeinfo")
    public ResponseEntity<String> getUserInfo() {
        return restTemplate.getForEntity("http://localhost:8091/employee", String.class);
    }
    @GetMapping("/salaryinfo")
    public ResponseEntity<String> getManagerInfo() {
        return restTemplate.getForEntity("http://localhost:8092/salarydata", String.class);
    }
}