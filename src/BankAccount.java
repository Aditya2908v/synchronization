public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public synchronized void deposit(double amount){
        balance += amount;
        System.out.println("Deposited " + amount + ", new balance: " + balance);
    }

    public synchronized void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn " + amount + ", new balance: " + balance);
        }else{
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
    public double getBalance(){
        return balance;
    }
}
