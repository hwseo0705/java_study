package day18.api.io.fileIOstream;

import java.io.*;

public class FileInputExample {
    public static void main(String[] args) {

        String path = "E:/sl_Haewon_Seo/java_study/java_study/src/datastructure/chap02/linkedlist/singly/Node.java";

        // try with resource : AutoClosable --> the interace automatically closes the file after it's done
        try (FileInputStream fis = new FileInputStream(path)) {

            // the first read will be 'p' of 'package' from 'Node.java'
            // int data = fis.read(); // read 1 byte at a time
            int data;
            while ((data = fis.read()) != -1) { // -1 : EOF
                System.out.write(data); // ASCII to String
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error : FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Error : IOException");
        }

/*
        // read file
        FileInputStream fis =  null;
        try {
            fis = new FileInputStream("E:/sl_Haewon_Seo/java_study/java_study/src/datastructure/chap02/linkedlist/singly/Node.java");

            // the first read will be 'p' of 'package' from 'Node.java'
            // int data = fis.read(); // read 1 byte at a time
            int data;
            while ((data = fis.read()) != -1) { // -1 : EOF
                System.out.write(data); // ASCII to String
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error : FileNotFoundException");
        } catch (IOException e) {
            System.out.println("Error : IOException");
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/
    }
}
