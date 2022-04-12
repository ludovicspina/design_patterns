package creational.factory_method_structure.creators;

import creational.factory_method_structure.products.ConcreteProductA;
import creational.factory_method_structure.products.Product;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class ConcreteCreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
