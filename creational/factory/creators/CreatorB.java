package creational.factory.creators;

import creational.factory.IFactory;
import creational.factory.IProduct;
import creational.factory.products.ProductB;

public class CreatorB implements IFactory {

    @Override
    public IProduct factoryMethod() {
        return new ProductB();
    }
}
