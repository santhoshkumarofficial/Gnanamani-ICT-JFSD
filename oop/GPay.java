package oop;

public class GPay extends DebitCard{
    public GPay(){}
    public GPay(int secret){
        this.upiPin = secret;
    }
    private int upiPin;
    public void fundTransfer(GPay receiver,int currentUpi, int amount){
        if(this.upiPin == currentUpi && getAccBal()>=amount){
            // debit from sender
            this.setAccBal(this.getAccBal()-amount);
            // credit to receiver
            receiver.setAccBal(receiver.getAccBal()+amount);
            System.out.println(receiver.getAccNo()+" has been credited with "+amount);
            System.out.println("Fund trransfer done");
        }
        else
            System.out.println("Transaction failed");
    }
}

class ExecuteMulti{
    public static void main(String[] args) {
        GPay mahesh = new GPay(7267);
        mahesh.setAccBal(98711);
        mahesh.setAccNo(9876567890L);
        GPay victor = new GPay(1111);
        victor.setAccBal(20000);
        victor.setAccNo(5676567656567L);
        mahesh.fundTransfer(victor, 7267, 100);
        System.out.println(mahesh.getAccBal()+" "+victor.getAccBal());
        victor.fundTransfer(mahesh, 1111, 40000);
    }
}

class ExecuteSingle{
    public static void main(String[] args) {
        DebitCard card1 = new DebitCard();
        card1.setAccBal(98000.3);
        card1.setAccNo(8765678765L);
        card1.setPin(9977);
        card1.setCardNo(765456786567L);

        card1.shopping(987999,9977);
    }
}

class DebitCard extends Account{
    private int pin;
    // private long accNo;
    // private Account account;
    private long cardNo;
    public void shopping(int amount, int currentPin){
        if(currentPin==pin){
            if(amount<=getAccBal()){
                setAccBal(getAccBal()-amount);
                System.out.println("Shopping for the amount "+amount+" done successfully");
                return;
            }
            System.out.println("Insufficient balance");
        }
        else
            System.out.println("Unauthorised access");
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public long getCardNo() {
        return cardNo;
    }
    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }
}

class Account{
    private long accNo;
    private double accBal;
    public long getAccNo() {
        return accNo;
    }
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }
    public double getAccBal() {
        return accBal;
    }
    public void setAccBal(double accBal) {
        this.accBal = accBal;
    }
}