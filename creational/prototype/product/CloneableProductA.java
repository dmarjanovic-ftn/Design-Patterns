package creational.prototype.product;

public class CloneableProductA extends CloneableProduct {

    public CloneableProductA(String name) {
        super(name);
    }

    public CloneableProductA(CloneableProductA product) {
        super(product);
    }

    @Override
    public CloneableProduct clone() {
        return new CloneableProductA(this);
    }
}
