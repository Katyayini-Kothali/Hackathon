class BankAccount{
    static int accountNumber;
    static String accountHolderName;
    static double balance;
    BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    static double deposit(double amount){
        balance=balance+amount;
        return balance;
    }
    static double withdraw(double amount){
        if(amount<balance){
            balance = balance-amount;
            return balance;
        } else {
            return balance;
        }
    }
    static double checkBalance(){
        return balance;
    }
    static void displayAccount(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Account holder name: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}
    public class Main{
        public static void main(String[] args){
            BankAccount ba = new BankAccount(123, "Sam", 20000);
            ba.deposit(300);
            ba.withdraw(1500);
            ba.checkBalance();
            ba.displayAccount();

        }
    }



