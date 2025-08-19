package oop;

// import java.util.Arrays;

public class FlipKart {
    private String[] cartItems = new String[2];
    // view cartItems
    public void viewItems(){
        for(String each:cartItems){
            System.out.println(each);
        }
    }
    // adding items in cartItems
    public void addToKart(String items){
        for(int index = 0; index < cartItems.length; index++ ){
            if(cartItems[index]==null){
                cartItems[index] = items;
                System.out.println(items+" has added to to the kart");
                return;
            }
        }
        System.out.println(items+" can't be added since kart is full");
    }
}

class Signup{
    public static void main(String[] args) {
        FlipKart ashish = new FlipKart();
        ashish.addToKart("iPhone 16 Pro");
        ashish.addToKart("iPad");
        ashish.addToKart("Microsoft Surface Pro");
        FlipKart deva = new FlipKart();
        deva.addToKart("Redmi Note 14 Pro");
        deva.addToKart("Rebok Casual Shoe");
        ashish.viewItems();
        deva.viewItems();
        // System.out.println(Arrays.toString(deva.cartItems));
    }
}
