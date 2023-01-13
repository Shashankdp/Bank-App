import java.util.Objects;
import java.util.UUID;

public class HDFCUser implements BankInterface{
    private String name;
    private String accountNo;
    private String password;
    private double balance;
    private double rateOfInterest;

    public HDFCUser(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.accountNo=String.valueOf(UUID.randomUUID());
        this.rateOfInterest=8.5;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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
        if(Objects.equals(password,enterpassword)) {
            balance = balance + amount;
            return "Money added successfully and your new balance is " + balance;
        }
        else{
            return "Wrong Password";
        }
    }

    @Override
    public String withdrawMoney(int amount, String enterpassword) {
        if(Objects.equals(password,enterpassword)){
            if (amount > balance) {
                return "Insufficient balance";
            }
            else{
                balance=balance-amount;
                return "Your balance is "+balance;
            }
        }
        else {
            return "Wrong Password";
         }
    }

    @Override
    public double calculateInterest(int years) {

        return (balance*years*rateOfInterest)/100;
    }
}
