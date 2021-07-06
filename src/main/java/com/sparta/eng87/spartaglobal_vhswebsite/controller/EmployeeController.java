package com.sparta.eng87.spartaglobal_vhswebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    //  add in the other functions a employee will have


    private FilmService filmService;
    private CustomerService customerService;

    @Autowired
    public EmployeeController(FilmService filmService, CustomerService customerService){
        this.filmService=filmService;
        this.customerService =customerService;
    }

    @PostMapping("/addVHS")
    public void addVHS(){
        FilmEntity filmEntity = new FilmEntity;
        filmService.save(filmEntity);
    }

    @PostMapping("/addcustomer")
    public void addCustomer(){
        CustomerEntity customerEntity = new CustomerEntity;
        customerService.save(customerEntity);
    }




}
