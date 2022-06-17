package creational.simplefactory;

import creational.simplefactory.car.BMW;
import creational.simplefactory.car.Car;
import creational.simplefactory.car.Honda;
import creational.simplefactory.car.Volkswagen;

/**
 * Simple Factory is just component that creates objects of different types.
 */
public class CarFactory {

    public Car createCar(CarEnum carType) {
        Car carToCreate;
        switch (carType) {
            case VOLKSWAGEN:
                carToCreate = new Volkswagen();
                break;
            case BMW:
                carToCreate = new BMW();
                break;
            case HONDA:
                carToCreate = new Honda();
                break;
            default:
                throw new IllegalArgumentException("No carType for such carType type");
        }
        return carToCreate;
    }
}
