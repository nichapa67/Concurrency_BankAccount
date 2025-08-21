public class Withdraw implements Runnable{
    BankAccount tmp;
    long value;
    int round;

    public Withdraw(BankAccount tmp, long value, int round){
        this.tmp=tmp;
        this.value=value;
        this.round=round;
    }

    @Override
    public void run() {
        for (int i = 0; i < round; i++) {
            tmp.withdraw(value);            
        }
    }
    
    
}
