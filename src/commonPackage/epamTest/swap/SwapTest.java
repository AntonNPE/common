package commonPackage.epamTest.swap;

public class SwapTest {

     int x;
    int y;

    public static void main(String[] args) {

        swapTwoVariables(10,13);

    }


    public static void swapTwoVariables(int a, int b){

        System.out.println("Before : x = " + a +  " y = " + b);

        int x = a;
        int y = b;
        x = a+b;
        y = a;
        x -=y;

        System.out.println("After : x = " + x + " y = " + y);




    }

}
