package creational;

import creational.abstractfactory.carcomponents.engine.Engine;
import creational.abstractfactory.carcomponents.factory.CarComponentFactory;
import creational.abstractfactory.carcomponents.factory.HondaCarComponentFactory;
import creational.abstractfactory.carcomponents.transmission.Transmission;
import creational.builder.Book;
import creational.builder.Genre;
import creational.builder.Year;
import creational.factorymethod.dialog.Dialog;
import creational.factorymethod.dialog.HtmlDialog;
import creational.factorymethod.dialog.WindowDialog;
import creational.simplefactory.car.Car;
import creational.simplefactory.CarEnum;
import creational.simplefactory.CarFactory;
import creational.prototype.shape.Circle;

/**
 * Class for demonstrating creational patterns work
 */
public class Sample {
    //no op
}

class SimpleFactory {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car bmw = carFactory.createCar(CarEnum.BMW);
        Car honda = carFactory.createCar(CarEnum.HONDA);

        bmw.run();
        honda.run();
    }
}

class AbstractFactory {

    public static void main(String[] args) {
        CarComponentFactory carComponentFactory = new HondaCarComponentFactory();

        Transmission hondaTransmission = carComponentFactory.createTransmission();
        Engine hondaEngine = carComponentFactory.createEngine();

        hondaTransmission.changeGear();
        hondaEngine.start();
    }
}

class Builder {

    public static void main(String[] args) {
        Book book = new Book.Builder("Required ISBN", "Harry Potter")
                .author("Joanne Rowling")
                .published(new Year(2000))
                .genre(Genre.ROMANCE)
                .description("Story about boy who survived")
                .build();

        System.out.println(book.getDescription());
    }
}

class Prototype {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        Circle circleCopy = circle.clone();

        System.out.println("Original circle " + circle.getRadius());
        System.out.println("Copy circle " + circleCopy.getRadius());
    }
}

class FabricMethod {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации или
     * окружения.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
