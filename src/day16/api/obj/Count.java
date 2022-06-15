package day16.api.obj;

public class Count {

    int n;

    // constructor
    public Count(int n) {
        System.out.println(n + "번 객체 생성됨!");
        this.n = n;
    }

    @Override
    protected void finalize() throws Throwable { // deprecated
        System.out.println(n + "번 객체 소멸!");
        super.finalize();
    }
}
