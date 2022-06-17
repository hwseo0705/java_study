package day18.api.io.buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) {

        // Buffered,,, is a sub stream, so must use it together with the main stream
        // Main Stream Reader : InputStreamReader --> it extends Reader
        // InputStreamReader needs an argument of InputStream type : System.in
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String s = br.readLine();
            System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
