package handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        int[] plans = {299,199,599,899};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the position to recharge ");
        int position=0;
        try{
            position = scanner.nextInt();
            position-=1;
            System.out.println("Selected pack "+plans[position]);
            System.out.println("recharge made successfully");
        }
        catch(InputMismatchException ins){
            Scanner newScanner = new Scanner(System.in);
            ins.printStackTrace();
            System.out.println("enter index in numberical");
            System.out.println("Enter index between 1 to "+plans.length);
            position = newScanner.nextInt();
            position-=1;
            System.out.println("Selected pack "+plans[position]);
            System.out.println("recharge made successfully");
        }
        catch(ArrayIndexOutOfBoundsException aio){
            aio.printStackTrace();
            System.out.println("Enter index between 1 to "+plans.length);
            position = scanner.nextInt();
            position-=1;
            System.out.println("Selected pack "+plans[position]);
            System.out.println("recharge made successfully");
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
