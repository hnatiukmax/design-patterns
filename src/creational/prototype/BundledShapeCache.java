package creational.prototype;

import creational.prototype.shape.Circle;
import creational.prototype.shape.Rectangle;
import creational.prototype.shape.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {

    public final String CIRCLE_KEY = "CIRCLE_KEY";
    public final String RECTANGLE_KEY = "RECTANGLE_KEY";

    private final Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.setX(5);
        circle.setY(7);
        circle.setRadius(45);
        circle.setColor("Green");

        Rectangle rectangle = new Rectangle();
        rectangle.setX(6);
        rectangle.setY(9);
        rectangle.setWidth(8);
        rectangle.setHeight(10);
        rectangle.setColor("Blue");

        cache.put(CIRCLE_KEY, circle);
        cache.put(RECTANGLE_KEY, rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
