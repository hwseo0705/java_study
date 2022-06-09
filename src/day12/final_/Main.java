package day12.final_;

public class Main {
    public static void main(String[] args) {
        Korean park = new Korean("Park", "991111-1122334", "중국");
        Korean kim = new Korean("Kim", "880202-2233441", "대한민국");
        Korean kim2 = new Korean("Kim2", "880202-2233441", "대한민국");
        Korean kim3 = new Korean("Kim3", "880202-2233441", "미국");

        park.name = "Seo";
        // kim.id = "880202-2999911"; // id is final
        // kim.nation = "China"; // nation is final, 불변성

        System.out.println(park);
        // 유일성 : 무슨짓을 해도 대한민국이 나와야함
        // static final : 무슨 값을 넣어도 set 되지 않음
        System.out.println(kim);
        System.out.println(kim2);
        System.out.println(kim3);
    }
}
