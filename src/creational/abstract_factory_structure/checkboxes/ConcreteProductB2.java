package creational.abstract_factory_structure.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
public class ConcreteProductB2 implements ProductB {

    @Override
    public void doStuff() {
        System.out.println("I'm a concrete product B2");
    }
}
