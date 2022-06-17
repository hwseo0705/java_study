package day18.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("E:/Exercise/javaStudy.txt")) {

            String str = "Java is so much fun!!\n I love Java";
            fw.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
