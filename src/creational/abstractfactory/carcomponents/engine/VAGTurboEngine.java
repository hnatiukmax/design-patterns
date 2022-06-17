package creational.abstractfactory.carcomponents.engine;

public class VAGTurboEngine implements Engine {

    @Override
    public void start() {
        System.out.println("VAG turbo engine was started");
    }
}
