package com.by.imooc.service;

import java.math.BigDecimal;

public class BigDecimalDemo {

    public static void main(String[] args) {

        double d = 12.343;
        BigDecimal a = new BigDecimal("1.08983984");
        BigDecimal b =  BigDecimal.valueOf(d);
        a.add(b);
        a.subtract(b);
        a.multiply(b);
//        a.divide(b);
        System.out.println(a);
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
//        System.out.println(a.divide(b));
        System.out.println(b);
    }

}
