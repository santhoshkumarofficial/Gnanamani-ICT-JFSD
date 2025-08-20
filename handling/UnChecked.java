package handling;

import java.util.Scanner;

public class UnChecked {
    public static void main(String[] args) {
        int[] plans = {299,199,599,899};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the position to recharge ");
        int position = scanner.nextInt();
        position-=1;
        try{
            System.out.println("Selected pack "+plans[position]);
            System.out.println("recharge made successfully");
        }
        catch(ArrayIndexOutOfBoundsException ao){
            ao.printStackTrace();
            try{
                System.out.println("enter the position between 1 to "+plans.length);
                position = scanner.nextInt();
                position-=1;
                System.out.println("Selected pack "+plans[position]);
                System.out.println("recharge made successfully");
            }
            catch(ArrayIndexOutOfBoundsException aio){
                try{
                    System.out.println("enter the position between 1 to "+plans.length);
                    position = scanner.nextInt();
                    position-=1;
                    System.out.println("Selected pack "+plans[position]);
                    System.out.println("recharge made successfully");
                }
                catch(ArrayIndexOutOfBoundsException ex){
                    System.out.println("Maximum attempts reached");
                }
            }
        }
        finally{System.out.println("Process Complete");}
    }
}
