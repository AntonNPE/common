package oracleTutorial.localClasses;

public class LocalClassesTest {



    public static void numberValidator (String phoneNumber) {

        String regularExpression = "[^0-9]";
        int constantLength = 10;
        class Formatter {

            private String candidate;
            public String getCandidate() {
                return candidate;
            }

            Formatter(String number){

                String tempNumber = number.replaceAll(regularExpression,"");
                int numberLength = 10;
                if (tempNumber.length() == numberLength){
                    candidate = tempNumber;
                }
                else candidate = "";


            }


        }
        Formatter formatter = new Formatter(phoneNumber);
        String formateNumber = formatter.getCandidate();
        if (formateNumber.length()!= constantLength) {
            System.out.println("Number is invalid");
        }
        else System.out.println("Number is - " + formateNumber);
    }



    public static void main(String[] args) {

            numberValidator("000789-123-456-7");

    }
}
