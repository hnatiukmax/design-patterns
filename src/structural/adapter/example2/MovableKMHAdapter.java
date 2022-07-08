package structural.adapter.example2;

public class MovableKMHAdapter implements Movable {

    private final static double KM_IN_M = 1.60934;

    private final Movable car;

    public MovableKMHAdapter(Movable car) {
        this.car = car;
    }

    @Override
    public double getMaxSpeed() {
        return car.getMaxSpeed() * KM_IN_M;
    }
}
