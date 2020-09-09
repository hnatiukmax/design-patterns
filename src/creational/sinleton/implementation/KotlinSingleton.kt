package creational.sinleton.implementation

/**
 * Java decompile code is similar to [StaticBlockSingleton] implementation.
 *
 * Advantages:
 * - thread safety.
 *
 * Disadvantages:
 * - not lazy initialization.
 * - no ability to pass argument for initialization.
 */
object KotlinSingleton {

    var value: String = ""

    init {
        print("object ${this::class.java.simpleName} init block.")
    }

    fun tripleValue(): String {
        return value.repeat(3)
    }
}