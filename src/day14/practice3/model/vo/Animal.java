package day14.practice3.model.vo;

public abstract class Animal {

    private String name;
    private String kinds;

    protected Animal() {
    }

    public Animal(String name, String kinds) {
        this.name = name;
        this.kinds = kinds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    @Override
    public String toString() {
        return String.format("저의 이름은 %s이고, 종류는 %s입니다.", name, kinds);
    }

    public abstract void speak();
}
