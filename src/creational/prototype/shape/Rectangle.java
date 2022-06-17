package creational.prototype.shape;

public class Rectangle extends Shape implements Cloneable {

    private int width;
    private int height;

    protected Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    public Rectangle() {}

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
