package parellel;

import java.util.Arrays;

public class MultiTask {
    static int index = 0;
    public static void main(String[] args) throws InterruptedException {
        CurrencyConverter curency = new CurrencyConverter();
        DutchMan man = new DutchMan();
        int[] salary = {9800,1200,5600};
        int[][] tickets = {{0,2,0,1,1},{1,0,2,0,2},{1,1,2,1,0}};
        while(index < tickets.length){
            Thread money = new Thread(()->curency.dollarToRupee(salary[index]));
            Thread order = new Thread(()->man.sortTickets(tickets[index]));
            money.start();
            order.start();
            order.join();
            index++;
        }
    }
}
// resource 
class CurrencyConverter{
    public void dollarToRupee(int dollar){
        System.out.println((dollar*87)+" is rupees for the "+dollar);
    }
}

class DutchMan{
    public void sortTickets(int[] arr){
        int start = 0, current = 0, end = arr.length-1;
        while(current<=end){
            int temp ;
            if(arr[current]==0){
                temp = arr[start];
                arr[start] = arr[current];
                arr[current] = temp;
                current++;start++;
            }
            else if(arr[current]==1)
                current++;
            else{
                temp = arr[end];
                arr[end] = arr[current];
                arr[current] = temp;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}