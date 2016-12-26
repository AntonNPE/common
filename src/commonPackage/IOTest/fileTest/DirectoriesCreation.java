package commonPackage.IOTest.fileTest;

import java.io.File;

public class DirectoriesCreation {



    public static void main(String[] args)throws  Exception {

//        dirCreation();
//       anotherFile(dirCreation(),"Ajax");
//        anotherFile(dirCreation(),"Den Haag");
//        anotherFile(dirCreation(),"Twente");
//        anotherFile(dirCreation(),"Roda");
//        clearAndDelDirectory(dirCreation());
//        deleteDirectory(dirCreation());
    }

    public static File dirCreation() throws  Exception{
        File anotherDir = new File("d:\" + File.separator + \"Java\\testIO\\text\\psv");
        anotherDir.mkdir();
        File file = new File(anotherDir,"psv.txt");
        file.createNewFile();
        return anotherDir;
    }

    public static void anotherFile(File dir, String name) throws  Exception{

        File anotherFile = new File(dir,name);
        anotherFile.createNewFile();

    }
    public static void deleteDirectory(File dir){
        System.out.println(dir.delete());
    }
    public static void clearAndDelDirectory (File dir){
        if(dir.isDirectory()){
            File [] fileList = dir.listFiles();
            for (File file : fileList){
                System.out.println("I'am going to kill you\t"+file.getName());
                System.out.println(file.delete());
            }
            System.out.println("I'am going to delete directory\t"+dir.getAbsolutePath());
            System.out.println(dir.delete());
        }
    }
}

