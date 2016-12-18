package commonPackage.IOTest;

import java.io.*;

public class PictureTransfer {

    public static void main(String[] args) {
        pictureTrasfer();
    }

    public static void pictureTrasfer() {

        String startDirectory = "d:\\Java\\testIO\\from\\Front.jpg";
        String finishDirectory = "d:\\Java\\testIO\\to\\Front.jpg";
        File fileFrom = new File(startDirectory);
        System.out.println("File From size - " + fileFrom.length() + " bytes");
        File fileTo = new File(finishDirectory);


        long startTime = System.nanoTime();
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileFrom)));
             DataOutputStream dataOutputStream=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileTo))))
        {

            byte buffer [] = new byte[1024];
            int byteRead;
            while ((byteRead = dataInputStream.read(buffer)) != -1) {
                dataOutputStream.write(buffer,0,byteRead);
            }
            long OperationTime = System.nanoTime() - startTime;
            System.out.println("Operation was producing during - " + OperationTime/1_000_000.00 + "ms");
        }catch(Exception ex){
            System.out.println("Exception happened");
        }

    }


}
