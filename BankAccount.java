public class BankAccount {
    private long balance=0;
    public synchronized void deposit(long amount){
        //if(amount>0){
            balance+=amount;
        //}
    }

    public synchronized void withdraw(long amount){
        if(balance>=amount){
            balance-=amount;
        }
    }

    public long getBalance(){
        return this.balance;
    }
}
