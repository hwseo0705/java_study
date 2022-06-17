package day18.api.io.obj;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2 {

    static List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {

        // loadTextFile();
        loadObject();

        for (Human h : humanList) {
            System.out.println(h);
        }
    }

    // read text file and put it in the list
    static void loadTextFile() {

        try (BufferedReader br = new BufferedReader(new FileReader("E:/Exercise/human.txt"))) {

            String s = "";
            while ((s = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(s, ",");
                humanList.add(new Human(st.nextToken(), Integer.parseInt(st.nextToken()), st.nextToken()));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // read sav file and put it in the list
    static void loadObject() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/Exercise/human.sav"))) {

            humanList = (List<Human>) ois.readObject();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
