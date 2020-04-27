package behavioral.mediator.components

import behavioral.mediator.mediators.Mediator

/**
 * General abstract class for concrete components.
 * Component subclasses communicate with [Mediator] through their common interface.
 * Thanks to this, the same components can be used in different [Mediator].
 * Also name of this class may be as "Colleague"
 */
abstract class Component(private val dialog: Mediator) {

    fun click() {
        dialog.notify(this, "CLICK")
    }

    fun keyPress() {
        dialog.notify(this, "KEY_PRESS")
    }
}