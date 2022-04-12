package creational.abstract_factory_structure.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class ConcreteProductA2 implements ProductA {

    @Override
    public void doStuff() {
        System.out.println("I'm a concrete product A2");
    }
}
