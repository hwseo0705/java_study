package CodingPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] token;
        String next;
        while (!(next = br.readLine()).isEmpty()) {
            token = next.split(" ");
            System.out.println(Integer.parseInt(token[0]) + Integer.parseInt(token[1]));
        }
        br.close();
    }
}