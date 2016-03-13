package creational.factory;

import creational.factory.creators.CreatorA;
import creational.factory.creators.CreatorB;

public class App {

    public static void main(String[] args) {

        IFactory factory = new CreatorA();
        factory.factoryMethod();

        factory = new CreatorB();
        factory.factoryMethod();
    }

}
