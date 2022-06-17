package creational.abstractfactory.factory;

import creational.abstractfactory.engine.Engine;
import creational.abstractfactory.engine.VAGTurboEngine;
import creational.abstractfactory.transmission.Transmission;
import creational.abstractfactory.transmission.VAGAutomaticTransmission;

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
