package day18.api.io.file;

import java.io.*;

public class FileExample {

    public static final String ROOT_PATH = "E:/Exercise";

    public static void main(String[] args) {

        // create a folder
        File dir = new File(ROOT_PATH + "/Dir/hello");

        // mkdir() vs mkdirs();
        // mkdir() : won't create a new file because it will create 'hello' in the directory 'E:/Exercise/Dir'
        //              which does not exist in this case since we are creating new
        // mkdirs() : will create the file

        // create folder command
        if (!dir.exists()) dir.mkdirs();

        // create a file
        File file1 = new File(ROOT_PATH + "/file1.txt");
        File file2 = new File(ROOT_PATH + "/file2.txt");
        File file3 = new File(ROOT_PATH + "/file3.txt");

        try {
            if (!file1.exists()) file1.createNewFile();
            if (!file2.exists()) file2.createNewFile();
            if (!file3.exists()) file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read folder & file info
        File exercise = new File(ROOT_PATH);

        // read all file info in current directory
        File[] files = exercise.listFiles();

        for (File f : files) {
            if (f.isDirectory()) {
                System.out.printf("Directory - Folder Name: %s\n", f.getName());
            } else {
                System.out.printf("File - File Name : %s, File Size: %d\n", f.getName(), f.length());
            }
        }
    }
}
