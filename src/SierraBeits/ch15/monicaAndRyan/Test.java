package sierraBeits.ch15.monicaAndRyan;

public class Test  {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        Thread monica = new Thread(new FinancionDeals(bankAccount),"Monica");
        Thread rayan = new Thread(new FinancionDeals(bankAccount), "Ryan");
        monica.start();
        rayan.start();

    }
}
