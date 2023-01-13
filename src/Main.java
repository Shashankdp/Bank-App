import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name, balance, password to create an account");

        //create user,
        String name=sc.next();
        double balance=sc.nextDouble();
        String password=sc.next();

        SBIUser user=new SBIUser(name,balance,password);
        String AC=user.getAccountNo(); //this is account number (UUID Number).
        System.out.println("SBI Account No is "+AC);

        //add money,
        System.out.println("Enter amount you want add");
        int money1=sc.nextInt();
        System.out.println("Enter password");
        String pass1=sc.next();
        String messege=user.addMoney(money1,pass1);
        System.out.println(messege);

        //withdraw money,
        System.out.println("Enter amount you want to withdraw");
        int money2=sc.nextInt();
        System.out.println("Enter password");
        String pass2=sc.next();
        System.out.println(user.withdrawMoney(money2,pass2));

        //rate of interest,
        System.out.println("Calculating interest");
        System.out.println("Enter number of years");
        int years=sc.nextInt();

        System.out.println("Total interest is "+user.calculateInterest(years));

        System.out.println("Your SBI Account creation is completed");


        HDFCUser cust=new HDFCUser(name,password,balance);
        String AC1=cust.getAccountNo(); //this is account number (UUID Number).
        System.out.println("HDFC Account No is "+AC1);

        //add money,
        System.out.println("Enter amount you want add");
        int addMoney=sc.nextInt();
        System.out.println("Enter password");
        String enterPass=sc.next();
        System.out.println(cust.addMoney(addMoney,enterPass));

        //withdraw money,
        System.out.println("Enter amount you want to withdraw");
        int wMoney=sc.nextInt();
        System.out.println("Enter password");
        String enterPassword=sc.next();
        System.out.println(cust.withdrawMoney(wMoney,enterPassword));

        //rate of interest,
        System.out.println("Calculating interest");
        System.out.println("Enter number of years");
        int numYears=sc.nextInt();

        System.out.println("Total interest is "+cust.calculateInterest(numYears));

        System.out.println("Your HDFC Account creation is completed");
    }
}