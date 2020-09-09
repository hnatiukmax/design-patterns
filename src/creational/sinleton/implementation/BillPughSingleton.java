package creational.sinleton.implementation;

/**
 * Advantages:
 * - thread safety.
 * - lazy initialization.
 *
 * Disadvantages:
 * - no ability to pass argument for initialization.
 */
public class BillPughSingleton {

    private BillPughSingleton() {
        System.out.println(this.getClass().getSimpleName() + " initialization.");
    }

    private static class SingletonHelper {

        private static final BillPughSingleton INSTANCE = new BillPughSingleton();

        public static BillPughSingleton getInstance() {
            return INSTANCE;
        }
    }
}