package creational.factory_method_example.factories;

import creational.factory_method_example.buttons.Button;
import creational.factory_method_example.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
