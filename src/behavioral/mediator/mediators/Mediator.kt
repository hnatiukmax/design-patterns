package behavioral.mediator.mediators

import behavioral.mediator.components.Component

/**
 * General interface for concrete mediators.
 */
interface Mediator {
    fun notify(sender: Component, event: String = "")
}