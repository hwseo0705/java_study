package day18.api.io.fileIOstream;

import java.io.*;

public class FileOutputExample {
    public static void main(String[] args) {

        // write file
        try (FileOutputStream fos = new FileOutputStream("E:/Exercise/dog.txt")) {

            String msg = "Doggo Woof Woof Doggo~\nHAHAHAHAHAHAHA";
            fos.write(msg.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
