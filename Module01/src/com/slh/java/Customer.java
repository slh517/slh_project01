package com.slh.java;


import java.util.ArrayList;

public class Customer {

    public static void main(String[] args) {

        System.out.println("奥力给！！！");

        ArrayList list = new ArrayList();

        Customer a = new Customer();

        a.method();

    }

    public void method() {
        int num = 10;
        System.out.println("另一个方法");
        System.out.println("Customer.method");
        System.out.println("num = " + num);


        String str[] = new String[]{"tom","jerry"};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }
        for (int i = 0; i < str.length; i++) {
            String s = str[i];


        }
    }

}
