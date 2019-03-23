package com.niroshan.collection;

import com.niroshan.generic.Manager;

import java.util.HashMap;
import java.util.Map;

public class HashMapsMain {

    public static void main(String[] args){
        Map<Integer,String> people  = new HashMap();

        people.put(new Integer(1),"Thusitha");
        people.put(new Integer(2),"Niroshan");
        people.put(new Integer(3),"Kularathna");
        people.put(new Integer(4),"Sheldon");

        System.out.println(people.keySet());
        System.out.println(people.put(new Integer(5),"Beckey"));
        System.out.println(people.keySet());
        for(Integer i : people.keySet()){
            System.out.println(people.get(i));
        }
    }
}
