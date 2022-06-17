package creational.abstractfactory.factory;

import creational.abstractfactory.engine.Engine;
import creational.abstractfactory.transmission.Transmission;

public interface CarComponentFactory {

    Transmission createTransmission();

    Engine createEngine();
}
