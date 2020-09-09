package creational.sinleton

import creational.sinleton.implementation.SingletonHolder

fun main() {
    val sin = SingletonHolder<String, Int> { it.toString() }
    sin.getInstance(3)
}