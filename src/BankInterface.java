public interface BankInterface {
    double checkBalance();
    String addMoney(int amount,String password);
    String withdrawMoney(int amount,String password);
    double calculateInterest(int years);

}
