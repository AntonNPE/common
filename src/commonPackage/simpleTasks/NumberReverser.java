package commonPackage.simpleTasks;

public class NumberReverser {

    public static void main(String[] args) {

        firstReverser(123456789);
        secondReverser(123456789);

    }


    public static void firstReverser(int number){

        String st ="";
        while (number > 0){
            st += number%10;
            number /=10;
        }
        int reversedNumber = Integer.valueOf(st);
        System.out.println(reversedNumber);
    }

    public static void secondReverser (int number){


        int reversedNumber=0;

        while  (number > 0){
            reversedNumber = reversedNumber*10 + number%10;
            number/=10;
        }
        System.out.println(reversedNumber);

    }

}
