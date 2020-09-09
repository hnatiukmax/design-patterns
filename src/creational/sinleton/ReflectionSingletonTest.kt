package creational.sinleton

import creational.sinleton.implementation.EagerInitializedSingleton

fun destroySingletonUsingReflection() {
    val instanceOne = EagerInitializedSingleton.getInstance()
    var instanceTwo: EagerInitializedSingleton? = null
    try {
        val constructors = EagerInitializedSingleton::class.java.declaredConstructors
        for (constructor in constructors) {
            //Below code will destroy the singleton pattern
            constructor.isAccessible = true
            instanceTwo = constructor.newInstance() as EagerInitializedSingleton
            break
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }

    println(instanceOne.hashCode())
    println(instanceTwo?.hashCode())
}