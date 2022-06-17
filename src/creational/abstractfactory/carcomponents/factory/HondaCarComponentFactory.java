package creational.abstractfactory.carcomponents.factory;

import creational.abstractfactory.carcomponents.engine.Engine;
import creational.abstractfactory.carcomponents.engine.HondaAtmosphericEngine;
import creational.abstractfactory.carcomponents.transmission.HondaMechanicalTransmission;
import creational.abstractfactory.carcomponents.transmission.Transmission;

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
