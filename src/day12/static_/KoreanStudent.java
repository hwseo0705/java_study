package day12.static_;

public class KoreanStudent {

    private String major;
    private static String nationality; // Korean student has to be Korean

    public void askMajor() {
        System.out.println(nationality);
        System.out.println(major);
    }

    // nationality is Korea, whoever you ask
    public static void askNationality() {
        System.out.println(nationality);
        // System.out.println(major); // doesn't work
    }

    public static void main(String[] args) {
        KoreanStudent.askNationality();
        KoreanStudent Haewon = new KoreanStudent();
        Haewon.askMajor();
    }
}
