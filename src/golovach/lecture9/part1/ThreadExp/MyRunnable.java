package golovach.lecture9.part1.ThreadExp;


public class MyRunnable  implements Runnable {


    int x;
    Entity ent;

    public MyRunnable(int x, Entity ent) {
        this.x = x;
        this.ent = ent;
    }


    @Override
    public void run() {

        ent.pulblicPrint(x);


    }
}
