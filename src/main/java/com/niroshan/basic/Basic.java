package com.niroshan.basic;

public class Basic {
    public static void main(String[] args) {
        System.out.println("====================================");
        final String a ;
        a = "abc";
        System.out.println("value of a: "+a);
        System.out.println("Cannot change variable a since it's not a object");
        System.out.println("====================================");

//        cannot reassign since it is already assigned
//        a = "xyz";
        final Person thusitha = new Person();
        thusitha.setName("Thusitha");
        thusitha.setAge(31);

        System.out.println(thusitha.toString());
        System.out.println("***** can change the variable as name since object *****");
        thusitha.setName("Niroshan");
        thusitha.setAge(40);
        System.out.println(thusitha.toString());
        System.out.println("====================================");




    }
}
