package commonPackage.multithreading.forteTask.accountManagment;

import java.util.Random;

public class Account  {

    private int balance;
    public synchronized void put (int value){


        System.out.println(Thread.currentThread().getName() + " going to increase balance with - " + value);
        balance+=value;
        System.out.println("balance is " + balance);
    }


    public synchronized void take (int value){

        System.out.println(Thread.currentThread().getName() + " going to decrease balance with - " + value);
        if (balance>=value){

            balance-=value;
            System.out.println("balance is " + balance);
        } else {
            System.out.println("Not enough money");
        }

    }
    public int accountValue(){
        return  balance;
    }
}
