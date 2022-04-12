package creational.factory_method_structure.creators;

import creational.factory_method_structure.products.ConcreteProductB;
import creational.factory_method_structure.products.Product;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class ConcreteCreatorB extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
