package creational.sinleton.implementation;

/**
 * Advantages:
 * - lazy initialization.
 *
 * Disadvantages:
 * - no thread safety.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    public String value;

    private LazyInitializedSingleton(String value) {
        this.value = value;
        System.out.println(this.getClass().getSimpleName() + " initialization.");
    }

    public static LazyInitializedSingleton getInstance(String value) {
        if (instance == null) {
            instance = new LazyInitializedSingleton(value);
        }
        return instance;
    }
}