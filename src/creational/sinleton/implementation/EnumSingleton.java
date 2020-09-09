package creational.sinleton.implementation;

/**
 * Advantages:
 * - thread safety.
 *
 * Disadvantages:
 * - no lazy initialization.
 * - no ability to pass argument for initialization.
 */
public enum EnumSingleton {
    INSTANCE;

    String value;

    void setValue(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }

    public static void doSomething() {
        //Do something
    }
}