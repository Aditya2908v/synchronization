

/*
    Synchronized blocks in Java are marked with the synchronized keyword.

    Synchronization is implemented in Java with a concept called monitors or locks.

    2 types of synchronization:
        process synchronization
        thread synchronization
            Mutual Exclusive: helps keep threads from interfering with one another
            while sharing data. There are three types of Mutual Exclusion
                    Synchronized method.
                    Synchronized block.
                    Static synchronization.
 */

public class Main{
    public static void main(String[] args){
        BankAccount account = new BankAccount(1000);

        Thread depositThread = new Thread(() ->{
            for(int i=0; i<5; i++){
                account.deposit(200);
            }
        });

        Thread withdrawThread = new Thread(() ->{
            for(int i=0; i<5; i++){
                account.withdraw(150);
            }
        });

        depositThread.start();
        withdrawThread.start();
    }
}