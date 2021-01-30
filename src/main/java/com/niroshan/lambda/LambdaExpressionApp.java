package com.niroshan.lambda;


@FunctionalInterface
interface Cab{
    double book(String from, String to);

}
public class LambdaExpressionApp {

    public static void main(String[] args){
        Cab cab = (String from,String to) -> {
            System.out.println("Cab is booked for "+ from +" to "+to);
            return 2.50;
        };
        cab.book("veyangoda","gampaha");
    }
}
