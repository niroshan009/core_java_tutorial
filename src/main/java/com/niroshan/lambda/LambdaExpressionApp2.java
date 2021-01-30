package com.niroshan.lambda;

interface Calculator{
    void add(int num1,int num2);
}
class Clac{
    public static void addSometing(int num1, int num2){
        System.out.println(num1+num2);
    }

    public void addSometing1(int num1, int num2){
        System.out.println(num1+num2);
    }


}

interface Messanger{
    Message getMessage(String message,int num);
}

class Message{
    Message(String message,int num){
        System.out.println("message is: "+ message +": "+num);
    }
}
public class LambdaExpressionApp2 {
    public static void main(String[] args){

        // 1. reference to a static method
        Calculator calculator = Clac::addSometing;
        calculator.add(12,33);

        // 1. reference to a non static method
        Clac cal = new Clac();
        Calculator calculator2 = cal::addSometing1;
        calculator.add(12,33);

        // 3. referencing to a constructor
        Messanger mRef = Message::new;
        mRef.getMessage("testtttttttt",3);

    }
}
