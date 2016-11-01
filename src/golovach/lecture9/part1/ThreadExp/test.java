package golovach.lecture9.part1.ThreadExp;



public class test {




    public static void main(String[] args) {
        Entity ent = new Entity();
        for (int i = 0; i < 5; i++) {
            new Thread(new MyRunnable(i,ent)).start();
        }
    }


}
