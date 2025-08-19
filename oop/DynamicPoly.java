package oop;

public class DynamicPoly {
    public static void main(String[] args) {
        // MyJio jio1 = new MyJio();
        // jio1.setAccNo(876545678765L);
        // jio1.setAccBal(900);
        // jio1.recharge(4);
        PhonePe phone = new PhonePe();
        phone.setAccNo(876545678765L);
        phone.setAccBal(900);
        phone.recharge(4);
    }
}

class PhonePe extends MyJio{
    public void recharge(int position){
        position-=1;
        if((plans[position]+3)<=getAccBal()){
            setAccBal(getAccBal()-(plans[position]+3));
            System.out.println("Recharge for "+plans[position]+" done successfully");
            return;
        }
        else{
            System.out.println("Insufficient account balance");
        }
    }
}

class MyJio extends Account{
    int[] plans = {299,199,599,899};
    public void recharge(int position){
        position-=1;
        if(plans[position]<=getAccBal()){
            setAccBal(getAccBal()-plans[position]);
            System.out.println("Recharge for "+plans[position]+" done successfully");
            return;
        }
        else{
            System.out.println("Insufficient account balance");
        }
    }
}