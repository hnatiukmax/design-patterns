package creational.prototype.shape;

public class Circle extends Shape {

    private int radius;

    protected Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    public Circle() {}

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }


}
