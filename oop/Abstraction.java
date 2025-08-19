package oop;

import java.util.Arrays;

public class Abstraction extends Alpha {
    public static void main(String[] args) {
        // InvoiceBill bill = new InvoiceBill();
        // bill.upload(1, "Shreenivasa");
        Abstraction abs = new Abstraction();
        abs.view();
        abs.delete(1);
    }

    @Override
    public void delete(int index) {
        arr[index] = 0;
        System.out.println("deleteion done");
    }
}

abstract class Alpha{
    int[] arr = {1,3,5,6,10};
    // non abstract method
    public void view(){
        System.out.println(Arrays.toString(arr));
    }
    // abstract 
    public abstract void delete(int index);
}

interface Perform{
    // abstract method
    void upload(int index, String newFile);
}

class InvoiceBill implements Perform{
    String[] clients = {"Gnanamani","Muthayammal","Paavai"};

    @Override
    public void upload(int index, String newFile) {
        // TODO Auto-generated method stub
        clients[index] = newFile;
        System.out.println(newFile+" client added");
    }

}

class Drive implements Perform{
    String[] files = {"resume","cover letter","internship letter"};
    //override
    public void upload(int index, String newFile){
        if(index>=0&&index<files.length){
            files[index] = newFile;
            System.out.println("Uploaded");
            return;
        }
        else{
            System.out.println("cant upload "+newFile);
        }
    }
}