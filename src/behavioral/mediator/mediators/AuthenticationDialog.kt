package behavioral.mediator.mediators

import behavioral.mediator.components.Button
import behavioral.mediator.components.CheckBox
import behavioral.mediator.components.Component
import behavioral.mediator.components.TextField

class AuthenticationDialog(
    private val textField: TextField,
    private val button: Button,
    private val checkBox: CheckBox
) : Mediator {

    override fun notify(sender: Component, event: String) {
        when (sender) {
            is Button -> {

            }
            is TextField -> {
                // Do some logic
            }
            is CheckBox -> {
                // Do some logic
            }
        }
    }
}