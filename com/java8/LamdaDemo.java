package com.java8;

public class LamdaDemo {

    public static void main(String[] args) {


        String bankName="HDFC bank";

        Bank b=(String gretting)->gretting+" "+bankName;

        String hello = b.getBankName("hello");

        System.out.println(hello);


        Bank b2=(String sayHello)->{
           return sayHello+" "+bankName;
        };


        System.out.println(b2.getBankName("hey"));
    }
}
