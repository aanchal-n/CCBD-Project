package com.ms3.controller;
import com.ms3.entity.ms3;
import com.ms3.services.ms3service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms3")
public class ms3controller {

    @Autowired
    private ms3service ms3service;

    @GetMapping("/{a}")
    public String getms3(@PathVariable("a") Integer a)
    {
        return this.ms3service.getms3(a);
    }
}
