package creational.sinleton.implementation;

/**
 * Advantages:
 * - thread safety.
 * - no lazy initialization.
 *
 * Disadvantages:
 * - no ability to pass argument for initialization.
 */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private StaticBlockSingleton() {
        System.out.println(this.getClass().getSimpleName() + " initialization.");
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}