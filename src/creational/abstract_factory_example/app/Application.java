package creational.abstract_factory_example.app;

import creational.abstract_factory_example.buttons.Button;
import creational.abstract_factory_example.checkboxes.Checkbox;
import creational.abstract_factory_example.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
