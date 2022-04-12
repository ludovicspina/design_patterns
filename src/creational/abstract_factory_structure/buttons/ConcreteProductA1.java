package creational.abstract_factory_structure.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class ConcreteProductA1 implements ProductA {

    @Override
    public void doStuff() {
        System.out.println("I'm a concrete product A1");
    }
}
