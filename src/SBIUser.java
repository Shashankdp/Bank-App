import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        //bank is initializing
        this.rateOfInterest=6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());
    }

    // i need getter and setter to access the private variable.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount, String enterpassword) {
        if(Objects.equals(enterpassword,password)) {
            balance = amount + balance;
            return "Money Added Successfully😊😊 and your new balance is " + balance;
        }
        else{
            return "Wrong password😡";
        }
    }

    @Override
    public String withdrawMoney(int amount, String enterpassword) {
        if(Objects.equals(enterpassword,password)){

         if(amount>balance){
            return "Insufficient Money😔";
         }
         else {
            balance = balance - amount;
            return "Your balance is "+balance;
         }

        }
        else{
            return "Wrong Password😡...";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
