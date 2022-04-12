package creational.abstract_factory_structure.factories;

import creational.abstract_factory_structure.buttons.ProductA;
import creational.abstract_factory_structure.checkboxes.ProductB;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}
