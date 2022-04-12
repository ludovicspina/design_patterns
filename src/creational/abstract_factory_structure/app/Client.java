package creational.abstract_factory_structure.app;

import creational.abstract_factory_structure.buttons.ProductA;
import creational.abstract_factory_structure.checkboxes.ProductB;
import creational.abstract_factory_structure.factories.AbstractFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Client {
    private ProductA productA;
    private ProductB productB;
    private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void someOperation() {
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.doStuff();
        productB.doStuff();
    }
}
