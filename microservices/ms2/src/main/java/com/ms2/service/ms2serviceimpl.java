package com.ms2.service;

import com.ms2.entity.sum;
import org.springframework.stereotype.Service;

@Service
public class ms2serviceimpl implements ms2service{
    @Override
    public Integer getsum(Integer a,Integer b) {
        int c = a+b;
        return c;
    }
}
