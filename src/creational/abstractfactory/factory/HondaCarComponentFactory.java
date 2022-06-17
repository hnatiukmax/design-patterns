package creational.abstractfactory.factory;

import creational.abstractfactory.engine.Engine;
import creational.abstractfactory.engine.HondaAtmosphericEngine;
import creational.abstractfactory.transmission.HondaMechanicalTransmission;
import creational.abstractfactory.transmission.Transmission;

public class HondaCarComponentFactory implements CarComponentFactory {

    @Override
    public Transmission createTransmission() {
        return new HondaMechanicalTransmission();
    }

    @Override
    public Engine createEngine() {
        return new HondaAtmosphericEngine();
    }
}
