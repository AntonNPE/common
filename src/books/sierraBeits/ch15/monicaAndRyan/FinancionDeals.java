package books.sierraBeits.ch15.monicaAndRyan;

public class FinancionDeals implements Runnable {

    BankAccount bankAccount;
    int cashValue = 15;

    public FinancionDeals(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        while (bankAccount.getMoneyCount() > cashValue) {
            bankAccount.moneyWithdraw(cashValue);
        }
        System.out.println(Thread.currentThread().getName() + "is over");
    }



}
