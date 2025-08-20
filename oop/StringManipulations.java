package oop;

import foundation.Boundries;

public class StringManipulations {
    public static void main(String[] args) {
        // Research.illustrateString();
        // Research.illustrateBufferAndBuilder();
        Research.isTwisted(13);
    }
}

class Research{
    public static void isTwisted(int number){
        Boundries boundries = new Boundries();
        if(boundries.isPrime(number)){
            StringBuffer buffer = new StringBuffer();
            buffer.append(number);
            String received = buffer.reverse().toString();
            int reversed = Integer.parseInt(received);
            if (boundries.isPrime(reversed))
                System.out.println("Twisted Prime");
            else
                System.out.println("Not twisted prime");
        }
        else
            System.out.println(number+" is not prime");
    }
    public static void illustrateBufferAndBuilder(){
        StringBuilder builder = new StringBuilder();
        builder.append(12);
        builder.append(true);
        builder.append(9.5);
        System.out.println(builder.toString());
    }
    public static void illustrateString(){
        // non lietral way of object creation
        String alpha = new String("Dart programming");
        // literal way object creation
        String beta = "flutter cross platform";
        // alpha.toUpperCase(); // immutable 
        alpha = alpha.toUpperCase(); // immutable 
        System.out.println(alpha);
        System.out.println("kotlin".compareTo("KOTLIN"));
        System.out.println("KOTLIN".compareToIgnoreCase("kotlin"));
        System.out.println(beta.substring(1,10));
        System.out.println(beta.getBytes());
    }
}