package creational.abstractfactory.carcomponents.factory;

import creational.abstractfactory.carcomponents.engine.Engine;
import creational.abstractfactory.carcomponents.transmission.Transmission;

public interface CarComponentFactory {

    Transmission createTransmission();

    Engine createEngine();
}
