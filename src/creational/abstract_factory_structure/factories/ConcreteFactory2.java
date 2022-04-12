package creational.abstract_factory_structure.factories;

import creational.abstract_factory_structure.buttons.ProductA;
import creational.abstract_factory_structure.buttons.ConcreteProductA2;
import creational.abstract_factory_structure.checkboxes.ProductB;
import creational.abstract_factory_structure.checkboxes.ConcreteProductB2;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
