package behavioral.strategy

import behavioral.strategy.strategy.NavigatorStrategy

/**
 * Class that works with different strategies via their
 * general interface. In our case this interface is [NavigatorStrategy].
 * We can dynamically change strategies implementation if we
 * need this.
 */
class Context(
    var strategy: NavigatorStrategy
) {

    fun getRoad() : String {
        val someA = Any()
        val someB = Any()

        return strategy.getStrategy(someA, someB)
    }
}