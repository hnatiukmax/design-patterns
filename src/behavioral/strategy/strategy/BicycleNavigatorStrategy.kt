package behavioral.strategy.strategy

import behavioral.strategy.Context

/**
 * Subclass, that implement general strategy interface [NavigatorStrategy].
 * Will be passed in [Context] to use in different cases.
 */
class BicycleNavigatorStrategy : NavigatorStrategy {

    override fun getStrategy(a: Any, b: Any) : String {
        return "Do some logic by BicycleNavigatorStrategy"
    }
}