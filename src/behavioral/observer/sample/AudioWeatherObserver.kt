package behavioral.observer.sample

import behavioral.observer.base.IObserver

class AudioWeatherObserver(
    private val weatherStation: WeatherStation
) : IObserver {

    override fun update() {
        val temperature = weatherStation.getTemperature()
        println("AudioObserver: temperature has changed to $temperature")
    }
}