package creational.abstractfactory.carcomponents.transmission;

public class VAGAutomaticTransmission implements Transmission {

    @Override
    public void changeGear() {
        System.out.println("Gear changed by VAG automatic transmission");
    }
}
