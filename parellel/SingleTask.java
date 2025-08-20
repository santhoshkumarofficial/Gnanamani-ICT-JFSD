package parellel;

import java.util.Scanner;

// execution class
public class SingleTask {
    public static void main(String[] args) throws InterruptedException {
        BmiCalculator calculator = new BmiCalculator();
        // calculator.findBmi(160, 76);
        // born state
        Thread t1 = new Thread(calculator,"mohamed");
        Thread t2 = new Thread(calculator,"Mohan");
        Thread t3 = new Thread(calculator,"richard");
        t1.start();
        t3.start();
        // t3.join();
        t2.start();
    }
}
// resource class
// class BmiCalculator extends Thread{
class BmiCalculator implements Runnable{
    public void findBmi(double height, double weight){
        // cm to m
        height /= 100;
        double bmi = weight/(height*height);
        if(bmi<=18.0)
            System.out.println(bmi+" you are underweight");
        else if(bmi>18.0&&bmi<=24.0)
            System.out.println(bmi+" you are normal");
        else if(bmi>24.0&&bmi<=30.0)
            System.out.println(bmi+" you are overweight");
        else
            System.out.println(bmi+" you are obese");
    }

    @Override
    // public void run() {
    synchronized public void run() {
        System.out.println("Welcome "+Thread.currentThread().getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the height and weight "+Thread.currentThread().getName());
        double userHeight = scanner.nextDouble();
        double userWeight = scanner.nextDouble();
        if(Thread.currentThread().getName().equals("richard"))
            Thread.currentThread().stop();
        findBmi(userHeight,userWeight);
        System.out.println("Thanks for visiting bmi calculation "+Thread.currentThread().getName());
    }
}