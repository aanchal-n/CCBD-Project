package com.ms3.entity;

import com.ms3.entity.sum;
import java.util.List;

public class ms3 {
    private Integer a;
    private Integer b;
    sum s = new sum();

    public ms3(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public ms3(Integer a, Integer b, sum s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

}
