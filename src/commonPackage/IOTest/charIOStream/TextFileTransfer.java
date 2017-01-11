package commonPackage.IOTest.charIOStream;

import java.io.*;

public class TextFileTransfer {

    public static void main(String[] args) {

        textTransfer();

    }

    public static void textTransfer() {

        String startDirectory = "d:" + File.separator + "Java\\testIO\\text\\from\\from.txt";
        String finishDirectory = "d:\\Java\\testIO\\text\\to\\to.txt";
        File fileFrom = new File(startDirectory);
        System.out.println("File From size - " + fileFrom.length() + " bytes");
        File fileTo = new File(finishDirectory);
        long startTime = System.nanoTime();
        try (BufferedReader  inputStream = new BufferedReader (new FileReader((fileFrom)));
             BufferedWriter outputStream = new BufferedWriter (new FileWriter((fileTo)))) {

//            int byteRead;
            String line;
            while ((line = inputStream.readLine()) != null) {
                outputStream.write(line);
            }
            long OperationTime = System.nanoTime() - startTime;
            System.out.println("Operation was producing during - " + OperationTime / 1_000_000.00 + "ms");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
