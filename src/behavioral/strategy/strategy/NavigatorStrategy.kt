package behavioral.strategy.strategy

import behavioral.strategy.Context

/**
 * General interface for all subclasses.
 * Will be used in [Context].
 * In our case it is interface for getting road information.
 */
interface NavigatorStrategy {

    fun getStrategy(a: Any, b: Any): String
}