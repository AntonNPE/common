package quizfull.intIncrement;


public class Test extends Test1 {

    Test (){
        System.out.println("Constructor TEST");
    }

    Test ( int d  ) {
        System.out.println("Constructor TEST with param -  " + d);
    }


        public static void main(String[] args) {

            Test test1 = new Test(1);
//        int x = 1;
//        Integer y = new Integer(x);
//        int[] z = {x};
//
//        func(x, y, z);
//
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z[0]);
//
//

        }

//    public static void func(int x, Integer y, int[] z) {
//
//        x=155;
//        y=333;
//        z[0]=333;
//
//    }
    }
class Test1 {

    Test1() {
        System.out.println("Constructor TEST1 without param");
    }

    Test1(int i) {
        System.out.println("Constructor TEST1 with param - " + i);
    }
}

