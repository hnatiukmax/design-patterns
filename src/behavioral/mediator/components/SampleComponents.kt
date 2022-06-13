package behavioral.mediator.components

import behavioral.mediator.mediators.Mediator

/**
 * Concrete components, which aren't directly related.
 * They have only one channel of communication - through sending
 * notifications to the [Mediator]
 */

class Button(mediator: Mediator) : Component(mediator)

class TextField(mediator: Mediator) : Component(mediator)

class CheckBox(mediator: Mediator) : Component(mediator)