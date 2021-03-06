package day16.api.obj;

// 객체 복사를 사용하려면 Cloneable 인터페이스를 구현해야 함.
public class Pen extends Object implements Cloneable {

    Company company; // 제조사 정보
    long serial; // 일련번호
    String color; // 색상
    int price; // 가격

    public Pen(Company company, long serial, String color, int price) {
        this.company = company;
        this.serial = serial;
        this.color = color;
        this.price = price;
    }


    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    // 일련번호 같으면 같다고 해버리기~
    @Override
    public boolean equals(Object o) {
        if (o instanceof Pen) {
            Pen p = (Pen) o;
            return this.serial == p.serial;
        }
        return false;
    }

    // shallow clone ( 해당 포인터 객체만 복사 )
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // deep clone ( 해당 포인터 객체와 컴포지션된 객체 모두 복사 )
    protected Object deepClone() throws CloneNotSupportedException {
        // 1. shallow clone
        Pen copy = (Pen) this.clone();
        copy.company = (Company) copy.company.clone();
        return copy;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}