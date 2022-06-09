package day12.final_;

public class Korean {

    String name;
    final String id; // 주민번호
    // 상수 : 불변성, 유일성 모두 만족 (final, static)
    static final String nation; /* = "Korea"; */ // 출신국가 --> if you want to make it 'final', you must initialize it

    static {
        nation = "대한민국";
    }
    public Korean(String name, String id, String nation) {
        this.name = name;
        this.id = id;
        // this.nation = "USA"; // 불변성
        // 여기서 지정 후에는 바꿀 수 없지만,,,, nation에 다른 값을 전달 받을 수 있다,,, china, usa, korea
//        this.nation = nation;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 주민번호: " + id + ", 국적: " + nation;
    }

    // 주민번호를 바꾸는 메서드
    public void changeId(String id) {
        // this.id = id; // does not work cuz id is final (works if it's private)
    }
}
