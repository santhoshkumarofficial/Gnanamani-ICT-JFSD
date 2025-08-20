package handling;

import java.util.Scanner;

public class EmiCalculator {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        int priciple = 0, tenure = 0;
        double rateOfInterest = 0.0, repayment;
        try{
            System.out.println("Welcome to ABC Finance EMI calculator");
            System.out.println("enter the principle amount ");
            priciple = scanner.nextInt();
            System.out.println("enter the tenure in months ");
            tenure = scanner.nextInt();
            System.out.println("Enter the rate of interest ");
            rateOfInterest = scanner.nextDouble();
            // calculate
            int years = tenure/12;
            repayment = priciple+(priciple*rateOfInterest*years)/100;
            int emi = (int)repayment/tenure;
            System.out.println("EMi "+emi);
        }
        catch(ArithmeticException ae){
            throw ae;
            // ae.printStackTrace();
            // System.out.println("enter the tenure non zero");
            // tenure = scanner.nextInt();
            // // calculate
            // int years = tenure/12;
            // repayment = priciple+(priciple*rateOfInterest*years)/100;
            // int emi = (int)repayment/tenure;
            // System.out.println("EMi "+emi);
        }
    }
    public static void main(String[] args) {
        try{
            EmiCalculator.calculate();
        }
        catch(ArithmeticException arith){
            System.out.println("Exception received at main");
            System.out.println("Tenure should be non zero number");
            EmiCalculator.calculate();
        }
    }
}
