package creational.prototype;

import creational.prototype.product.CloneableProduct;
import creational.prototype.product.CloneableProductA;

/*
    Notice that this is not best example because Java's clone() is shallow copy.
    In concrete CloneableProduct you can see we use new ConcreteProduct(this).
    That means we've made deep copy of product. 
 */
public class App {

	public static void main(String[] args) {
        CloneableProduct prototype = new CloneableProductA("Product A");

        System.out.println(prototype.getName());

        CloneableProductA o = (CloneableProductA) prototype.clone();

        System.out.println(o.getName());

        o.setName("Product C");

        System.out.println(o.getName());
        System.out.println(prototype.getName());

	}

}
