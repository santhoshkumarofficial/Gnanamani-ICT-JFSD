package oop;

public class TellerMachine {
    // encapsulation
    private static int machineBalance;
    public TellerMachine(){
        machineBalance = 20000;
    }
    public TellerMachine(int balance){
        machineBalance = balance;
    }
    public String withdraw(int amount){
        if(amount<=machineBalance){
            machineBalance-=amount;
            return amount+" debited";
        }
        return "insufficent balance";
    }
    public void deposit(int amount){
        machineBalance+=amount;
        System.out.println(amount+" has been deposited");
    }
    public void viewBalance(){
        System.out.println(machineBalance+" is available in the machine");
    }
}

class Access{
    public static void main(String[] args) {
        // default cons
        // TellerMachine teller = new TellerMachine();
        // parameterized cons
        TellerMachine teller = new TellerMachine(5000000);
        System.out.println(teller.withdraw(600000));
        teller.deposit(89000);
        teller.viewBalance();
    }
}
