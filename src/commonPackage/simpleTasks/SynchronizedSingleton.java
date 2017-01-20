package commonPackage.simpleTasks;

public class SynchronizedSingleton {


    public static void main(String[] args) {

        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        System.out.println(sing==sing2);

    }
}
class Singleton {
    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton (){

    }

}