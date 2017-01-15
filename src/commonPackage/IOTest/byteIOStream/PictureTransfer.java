package commonPackage.IOTest.byteIOStream;

import java.io.*;

public class PictureTransfer {

    public static void main(String[] args) {
        pictureTransfer();
    }

    public static void pictureTransfer() {

        String startDirectory = "d:\\Java\\testIO\\from\\from.txt";
        String finishDirectory = "d:\\Java\\testIO\\to\\to.txt";
        File fileFrom = new File(startDirectory);
        System.out.println("File From size - " + fileFrom.length() + " bytes");
        File fileTo = new File(finishDirectory);
        long startTime = System.nanoTime();
        try ( BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileFrom));
         BufferedOutputStream outputStream=new BufferedOutputStream( new FileOutputStream(fileTo)))
        {

            int byteRead;
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }
            long OperationTime = System.nanoTime() - startTime;
            System.out.println("Operation was producing during - " + OperationTime/1_000_000.00 + "ms");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
