package com.ms3.services;

import com.ms3.entity.ms3;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ms3serviceimpl implements ms3service{

    @Override
    public String getms3(Integer a) {
        if (a%2 == 0)
            return ("EVEN");
        else
            return ("ODD");
    }
}
