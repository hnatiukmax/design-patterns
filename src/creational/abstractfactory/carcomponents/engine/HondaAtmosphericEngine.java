package creational.abstractfactory.carcomponents.engine;

public class HondaAtmosphericEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Honda atmospheric engine was started");
    }
}
