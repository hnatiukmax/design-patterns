package creational.abstractfactory.carcomponents.factory;

import creational.abstractfactory.carcomponents.engine.Engine;
import creational.abstractfactory.carcomponents.engine.VAGTurboEngine;
import creational.abstractfactory.carcomponents.transmission.Transmission;
import creational.abstractfactory.carcomponents.transmission.VAGAutomaticTransmission;

public class VAGCarComponentFactory implements CarComponentFactory {

    @Override
    public Transmission createTransmission() {
        return new VAGAutomaticTransmission();
    }

    @Override
    public Engine createEngine() {
        return new VAGTurboEngine();
    }
}
