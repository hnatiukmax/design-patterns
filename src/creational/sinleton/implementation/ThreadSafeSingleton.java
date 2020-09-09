package creational.sinleton.implementation;

/**
 * Advantages:
 * - thread safety.
 * - lazy initialization.
 * - good performance in {@link ThreadSafeSingleton#getInstanceGoodPerformance}
 *
 * Disadvantages:
 * - bad performance in {@link ThreadSafeSingleton#getInstanceBadPerformance}.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    public String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
        System.out.println(this.getClass().getSimpleName() + " initialization.");
    }

    public static synchronized ThreadSafeSingleton getInstanceBadPerformance(String value) {
        if (instance == null) {
            instance = new ThreadSafeSingleton(value);
        }
        return instance;
    }

    public static synchronized ThreadSafeSingleton getInstanceGoodPerformance(String value) {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton(value);
                }
            }
        }
        return instance;
    }
}