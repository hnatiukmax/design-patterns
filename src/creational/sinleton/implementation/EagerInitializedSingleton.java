package creational.sinleton.implementation;

/**
 * Advantages:
 * - thread safety.
 *
 * Disadvantages:
 * - not lazy initialization.
 * - no ability for exception handling.
 * - no ability to pass argument for initialization.
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        System.out.println(this.getClass().getSimpleName() + " initialization.");
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}