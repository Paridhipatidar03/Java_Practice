 class Account {
    
    private int ano, balance;

    public Account(int ano,int balance){
        this.ano=ano;
        this.balance=balance;
    }
    public synchronized void withdraw(int amount){

        if(balance>=amount){

            System.out.println("Transaction allowed for " +ano);
            System.out.println("Collect Cash "+amount + "from "+ano);
            
            balance=balance-amount;
            System.out.println("Remaining Balance In " +ano + " : " + balance);
        }
        else{
            System.out.println("insufficient balance in "+ano);
        }
    }
}

public class AccountWithdrawSyn extends Thread {
 
    private Account account
    ;
    public void run(){
        account.withdraw(7000);
    }

    public static void main(String[] args) {
        
        AccountWithdrawSyn c1= new AccountWithdrawSyn();
        AccountWithdrawSyn c2= new AccountWithdrawSyn();
        AccountWithdrawSyn c3= new AccountWithdrawSyn();

        Account ac1 = new Account(111,10000);
        Account ac2 = new Account(112,10000);
        Account ac3 = new Account(113,10000);

        c1.account=ac1;
        c2.account=ac2;
        c3.account=ac1;

        c1.start();
        c2.start();
        c3.start();
    }
}