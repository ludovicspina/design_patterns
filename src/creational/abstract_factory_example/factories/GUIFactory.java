package creational.abstract_factory_example.factories;

import creational.abstract_factory_example.buttons.Button;
import creational.abstract_factory_example.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
