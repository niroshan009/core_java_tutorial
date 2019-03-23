package com.niroshan.collection;

import jdk.internal.dynalink.linker.LinkerServices;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMain {

    public static void main(String[] args){
        List<String> staff = new LinkedList<>();

        staff.add("Thusitha");
        staff.add("Niroshan");
        staff.add("Dinesh");
        staff.add("Kumara");

        /*Iterator iterator = staff.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();

        }*/


        ListIterator listIterator = staff.listIterator();

        listIterator.next();
        listIterator.add("Niranjan");

        System.out.println(staff);

        while (listIterator.hasPrevious()){
            listIterator.previous();
        }

        listIterator.remove();
        System.out.println(staff);

        List<String> armyStaff = new LinkedList<>();
        armyStaff.add("John");
        armyStaff.add("Kevin");
        armyStaff.add("Mark");

        staff.addAll(armyStaff);

        System.out.println(staff);

    }
}
