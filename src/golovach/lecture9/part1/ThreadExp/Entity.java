package golovach.lecture9.part1.ThreadExp;

public class Entity {






    public synchronized void pulblicPrint(int x) {
        try {
            System.out.println("+" + x);
            Thread.currentThread().sleep(1001);
            System.out.println("-"+ x);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }


}
