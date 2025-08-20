package handling.mycode;

import java.util.Scanner;

public class BMIcalculator {
    double weight;
    double height;
    public void bmi(){
            if(weight<0 || height<0){
                System.out.println("Invalid input");
        }
            else {
                double heightincm=height/100;
                double bmi=weight/(heightincm*heightincm);
                System.out.println(bmi);
    }
}
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        BMIcalculator person=new BMIcalculator();
        System.out.println("enter the weight");
        person.weight=scanner.nextDouble();
        System.out.println("enter the height in cm");
        person.height=scanner.nextDouble();
        person.bmi();
    }
}
