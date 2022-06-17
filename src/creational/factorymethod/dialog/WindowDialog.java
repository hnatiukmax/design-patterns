package creational.factorymethod.dialog;

import creational.factorymethod.button.Button;
import creational.factorymethod.button.WindowButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new WindowButton();
    }
}
