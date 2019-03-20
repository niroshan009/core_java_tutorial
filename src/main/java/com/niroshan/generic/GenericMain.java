package com.niroshan.generic;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GenericMain {

    public static void main(String[] args){


        String[] values = {"Mary", "had", "a", "little", "lamb"};
        //Pair method can hold any type of retrun type
        //This Pair holds String type
        Pair<String> mm= ArrayAlg.minmax(values);
        System.out.println("Min: "+ mm.getFirst());
        System.out.println("Max: "+ mm.getSecond());



        int[] intArr = {2,5,6,7,9,4};
        //This Pair holds Integer type
        Pair<Integer> maxNumber = ArrayAlg.getMax(intArr);
        System.out.println("Max integer: "+ maxNumber.getFirst());


        //calling generic method, below variables hold  string and Integer/Double which calls the same method
        String stringMiddle = ArrayAlg.getMiddle("Big","Brown", "Fox", "Jumps","Over","the","Fence");
        System.out.println("Middle String value : "+ stringMiddle);
        //Have to pass same type in below getMiddle to avoid errors
        Double intMiddle = ArrayAlg.<Double>getMiddle(44.55,33.33,22.22,66.44,77.55);
        System.out.println("Middle integer value: "+ intMiddle);

        //Calling improvedMinmax method will have to pass only objects which implements Compareable
        GregorianCalendar[] birthdays = {
                new GregorianCalendar(1990, Calendar.SEPTEMBER, 18),
                new GregorianCalendar(1998, Calendar.DECEMBER, 12),
                new GregorianCalendar(2000, Calendar.MARCH, 1),
                new GregorianCalendar(2009, Calendar.APRIL, 4),
                new GregorianCalendar(1899, Calendar.JANUARY, 6),
                new GregorianCalendar(1998, Calendar.AUGUST, 8)
        };

        Pair<GregorianCalendar> birthdayPair = ArrayAlg.improvedMinmax(birthdays);
        System.out.println("Min birthday: "+ birthdayPair.getFirst().getTime());
        System.out.println("Max birthday: "+ birthdayPair.getSecond().getTime());

        Manager[] mgrArr = {new Manager("Th"), new Manager("Ku")};

        Pair<Manager> emp = ArrayAlg.improvedMinmax(mgrArr);

        Manager e = new Manager("Niranjan");
        Manager f = new Manager("Thusitha");

        Pair<Manager> p = new Pair(e,f);
        ArrayAlg.printBuddies(p);




    }
}

class ArrayAlg{

    public static Pair<String> minmax(String[] a){
        if (a == null || a.length == 0){
            return  null;
        }
        String min = a[0];
        String max = a[0];

        for(int i=1; i < a.length; i++){
            if(min.compareTo(a[i])> 0 ) min = a[i];
            if(max.compareTo(a[i])<0) max = a[i];
        }

        return  new Pair<>(min,max);
    }

    public static <T extends Comparable> Pair<T> improvedMinmax(T[] a){
        if (a == null || a.length == 0){
            return null;
        }

        T min = a[0];
        T max = a[0];

        for(int i=1; i < a.length; i++){
            if(min.compareTo(a[i])> 0 ) min = a[i];
            if(max.compareTo(a[i])<0) max = a[i];
        }

        return  new Pair<>(min,max);


    }

    public static Pair<Integer> getMax(int[] a){
        int max = a[0];
        if(a==null || a.length == 0){
            return null;
        }

        for(int i = 1; i < a.length ; i++){
            if(max < a[i]) max = a[i];
        }

        Integer i = new Integer(max);
        Pair<Integer> pair = new Pair<>();
        pair.setFirst(i);
        return pair;
    }

    public static <T> T getMiddle(T... args){
        return args[args.length/2];
    }


    //bounds for type variable
    //extends Comparable means we will only accept types which has been implemented Comparable interfaces
    //T extends Comparable & Serializable
    public static <T extends Comparable> T min(T[] a){
        if( a == null || a.length == 0){
            return null;
        }

        T smallest = a[0];

        for(int i = 0 ; i < a.length; i++){
            if(smallest.compareTo(a[i])>0) {
                smallest = a[i];
            }

        }

        return smallest;
    }


    //if we define parameters as Pair<Employee> it will only accept employees
    //We define as
    public static void printBuddies(Pair<? extends  Employee> p){
        System.out.println("First: "+p.getFirst().getName()
        +"\nSecond: "+p.getSecond().getName());

    }


}
