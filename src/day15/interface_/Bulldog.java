package day15.interface_;

public class Bulldog extends Dog implements Pet, Huntable {

    // since 'Bulldog' is extending 'Dog', no need to override 'play' here
    @Override
    public void hunt(String target) {

    }
}
