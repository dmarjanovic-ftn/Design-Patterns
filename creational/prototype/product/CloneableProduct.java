package creational.prototype.product;

public abstract class CloneableProduct {

    private String name;

    public CloneableProduct(String name) {
        this.name = name;
    }

    public CloneableProduct(CloneableProduct product) {
        this.name = product.getName();
    }

    public abstract CloneableProduct clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
