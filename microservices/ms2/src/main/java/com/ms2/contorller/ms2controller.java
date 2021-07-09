package com.ms2.contorller;


import com.ms2.service.ms2service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ms2")
public class ms2controller {

    @Autowired
    private ms2service ms2service;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{a},{b}")
    public String getms2(@PathVariable("a") Integer a,@PathVariable("b") Integer b)
    {
        int sum = this.ms2service.getsum(a,b);
        String res = this.restTemplate.getForObject("http://localhost:9001/ms3/"+sum,String.class);
        return ("sum of "+a+" and "+b+" = " +sum+"\n"+"------>"+res);
    }
}
