package creational.prototype.product;

public class CloneableProductB extends CloneableProduct {

    public CloneableProductB(String name) {
        super(name);
    }

    public CloneableProductB(CloneableProductB product) {
        super(product);
    }

    @Override
    public CloneableProduct clone() {
        return new CloneableProductB(this);
    }
}
