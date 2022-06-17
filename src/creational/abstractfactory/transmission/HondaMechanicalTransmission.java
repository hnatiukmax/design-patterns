package creational.abstractfactory.transmission;

public class HondaMechanicalTransmission implements Transmission {

    @Override
    public void changeGear() {
        System.out.println("Gear changed by Honda transmission transmission");
    }
}
