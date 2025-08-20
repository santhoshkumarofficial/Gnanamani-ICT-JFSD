package handling;

import java.util.Arrays;
import java.util.Scanner;

public class WareStore {
    private static final String passcode = "gct@2025";
    private String[] items = {"Dell","Asus","Acer","Lenevo","HP","Mac"};
    public void viewItems(){
        System.out.println(Arrays.toString(items));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WareStore ware = new WareStore();
        String userPassword = "";
        try{
            System.out.println("enter the password ");
            userPassword = scanner.next();
            if(userPassword.equals(ware.passcode))
                ware.viewItems();
            else
                throw new AuthenticationException();
        }
        catch(AuthenticationException auth){
            System.out.println(auth);
            System.out.println("enter the password ");
            userPassword = scanner.next();
            if(userPassword.equals(ware.passcode))
                ware.viewItems();
            else
                System.out.println("Max attempt reached");
        }
    }
}
