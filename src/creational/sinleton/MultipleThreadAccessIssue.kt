package creational.sinleton

import creational.sinleton.implementation.LazyInitializedSingleton
import kotlin.concurrent.thread

/**
 * Example which destroys singleton idea.
 */
fun multiThreadIssue() {
    thread(start = true) {
        val singleton = LazyInitializedSingleton.getInstance("Foo");
        println(singleton.value)
    }

    thread(start = true) {
        val singleton = LazyInitializedSingleton.getInstance("Bar");
        println(singleton.value)
    }
}