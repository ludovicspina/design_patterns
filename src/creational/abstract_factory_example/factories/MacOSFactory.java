package creational.abstract_factory_example.factories;

import creational.abstract_factory_example.buttons.Button;
import creational.abstract_factory_example.buttons.MacOSButton;
import creational.abstract_factory_example.checkboxes.Checkbox;
import creational.abstract_factory_example.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
