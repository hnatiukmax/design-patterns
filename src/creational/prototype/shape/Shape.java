package creational.prototype.shape;

public abstract class Shape {

    protected int x;
    protected int y;
    protected String color;

    protected Shape(Shape shapeToCopy) {
        if (shapeToCopy != null) {
            this.x = shapeToCopy.x;
            this.y = shapeToCopy.y;
            this.color = shapeToCopy.color;
        }
    }

    public Shape() {}

    @Override
    public abstract Shape clone();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
}