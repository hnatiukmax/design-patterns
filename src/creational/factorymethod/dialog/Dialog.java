package creational.factorymethod.dialog;

import creational.factorymethod.button.Button;

/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты продуктов, разные для каждой фабрики.
     */
    protected abstract Button createButton();
}
