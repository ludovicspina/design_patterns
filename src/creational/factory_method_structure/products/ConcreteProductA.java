package creational.factory_method_structure.products;

/**
 * Windows button implementation.
 */
public class ConcreteProductA implements Product {
    @Override
    public void doStuff() {
        System.out.println("ConcreteProductA");
    }
}
