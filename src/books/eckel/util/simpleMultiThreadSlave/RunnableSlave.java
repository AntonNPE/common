package books.eckel.util.simpleMultiThreadSlave;

public class RunnableSlave implements Runnable {

    private static int taskCount = 1000;
    private int id = taskCount++;
    private int innerNumber = 10;
    private String name;

    public RunnableSlave() {
        name = id + "";
    }

    public RunnableSlave(String name) {
        this.name = name + id;
    }

    @Override
    public void run() {

        System.out.println("Hi, my name is " + name);
        while (innerNumber --> 0){
            System.out.print("( " + innerNumber + " )");
        }
        System.out.println();
    }
}
