package day17.generic;

public class Main {
    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();

        // we want to make separate basket for each fruit
        // but this adds all kinds to this one basket
        /*
        Basket basket = new Basket();
        basket.setFruit(new Apple());
        basket.setFruit(new Banana());
        */

        Basket<Apple> appleBasket = new Basket<>();
        appleBasket.setFruit(new Apple());
        Apple a = appleBasket.getFruit();

        Basket<Banana> bananaBasket = new Basket<>();
        bananaBasket.setFruit(new Banana());
        Banana b = bananaBasket.getFruit();

        Basket<Grape> grapeBasket = new Basket<>();
        grapeBasket.setFruit(new Grape());
        Grape g = grapeBasket.getFruit();

        // but I only want this to be a fruit basket
        // then you add 'extends Fruit' in <F> in Basket class
        // Basket<Toy> toyBasket = new Basket<>();


    }
}
