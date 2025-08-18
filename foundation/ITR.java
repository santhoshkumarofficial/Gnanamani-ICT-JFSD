package foundation;

import java.util.Arrays;

class Perform{
    public void findSecondMaxTaxpayer(double[] arr){
        double firstMax = Double.MIN_VALUE, secondMax = Double.MIN_VALUE;
        for(double each:arr){
            if(each>firstMax){
                secondMax = firstMax;
                firstMax = each;
            }
            else if(each>=secondMax&&each!=firstMax){
                secondMax = each;
            }
        }
        System.out.println("Second max is "+secondMax);
    }
    public void deductTax(double[] arr){
        int size = arr.length;
        for(int index = 0; index < size; index++){
            if(arr[index]>=7.1&&arr[index]<=10.0)
                // System.out.println("tax payable is 10 precentage");
                arr[index] -= (arr[index]*0.100);
            else if(arr[index]>10.0&&arr[index]<=15.0)
                // System.out.println("15 precentage tax");
                arr[index] -= (arr[index]*0.150);
            else if(arr[index]>15.0&&arr[index]<=20.0)
                // System.out.println("20 precentage tax");
                arr[index] -= (arr[index]*0.200);
            else if(arr[index]>20.0&&arr[index]<25.0)
                // System.out.println("25 precentage tax");
                arr[index] -= (arr[index]*0.250);
            else if(arr[index]>25.0)
                // System.out.println("30 precentage tax");
                arr[index] -= (arr[index]*0.300);
            else
                System.out.println("no tax need to pay");
        }
    }
}

public class ITR {
    public static void modified(int maxi){
        maxi-=10;
        System.out.println("Maxi after offer "+maxi);
    }
    public static void main(String[] args) {
        double[] itrs = {8.9,12.5,7.2,35.7,35.7,15.6,3.2};
        // finding tax percentage
        // for(double sample : itrs){
        // int data = 1569;
        // ITR.modified(data);
        // System.out.println("After offer call "+data);
        Perform performing = new Perform();
        // performing.deductTax(itrs);
        performing.findSecondMaxTaxpayer(itrs);
        // System.out.println(Arrays.toString(itrs));
    }
}
