package behavioral.observer.sample

import behavioral.observer.base.IObservable
import behavioral.observer.base.IObserver

class WeatherStation : IObservable {

    private val observers = mutableSetOf<IObserver>()
    private var mTemperature: Float? = null

    fun changeTemperature(newTemperature: Float) {
        mTemperature = newTemperature
        notifyObservers()
    }

    fun getTemperature(): Float? {
        return mTemperature
    }

    override fun addObserver(observer: IObserver) {
        observers.add(observer)
    }

    override fun removeObserver(observer: IObserver) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        observers.forEach(IObserver::update)
    }
}