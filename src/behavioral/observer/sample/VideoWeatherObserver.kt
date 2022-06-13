package behavioral.observer.sample

import behavioral.observer.base.IObserver

class VideoWeatherObserver(
    private val weatherStation: WeatherStation
) : IObserver {

    override fun update() {
        val temperature = weatherStation.getTemperature()
        println("VideoObserver: temperature has changed to $temperature")
    }
}