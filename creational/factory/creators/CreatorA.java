package creational.factory.creators;

import creational.factory.IFactory;
import creational.factory.IProduct;
import creational.factory.products.ProductA;

public class CreatorA implements IFactory {

    @Override
    public IProduct factoryMethod() {
        return new ProductA();
    }
}
