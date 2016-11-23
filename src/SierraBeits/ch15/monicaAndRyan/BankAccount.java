package sierraBeits.ch15.monicaAndRyan;


public class BankAccount {

    private int moneyCount = 50;
    public int getMoneyCount() {
        return moneyCount;
    }
    public void cashOut(int value){
        if (moneyCount>value)  moneyCount = moneyCount - value;
        else System.out.println(" Not enough money for --->" + Thread.currentThread().getName());
    }

    public synchronized void moneyWithdraw(int cashValue) {
        try {
            System.out.println(Thread.currentThread().getName() + " - begin the transaction");
            System.out.println("Money rest before = " + getMoneyCount());
            if (getMoneyCount() > cashValue) {
                System.out.println(Thread.currentThread().getName()+ " going to sleep");
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+  " - awake");
                cashOut(cashValue);
                System.out.println("Money rest after = " + getMoneyCount());
            }
            else System.out.println(Thread.currentThread().getName() + " - over moneyWithdraw");
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
