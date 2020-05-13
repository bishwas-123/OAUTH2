package com.assignment.secureapp1;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter
{
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/productdata").permitAll()
                .antMatchers("/salary").hasRole("MANAGER")
                .antMatchers("/employee").hasRole("EMPLOYEE")
                .antMatchers("/employee").hasRole("MANAGER")
                //.antMatchers("/userinfo").hasRole("CUSTOMER")
                .anyRequest()
                .authenticated();
    }
}
