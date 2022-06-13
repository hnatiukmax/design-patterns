package behavioral.observer.sample

fun main() {
    //create observable, first observer, change state of observable
    val weatherStation = WeatherStation()
    val videoWeatherObserver = VideoWeatherObserver(weatherStation)
    weatherStation.addObserver(videoWeatherObserver)
    weatherStation.changeTemperature(21.7f)

    //create and add second observer
    val audioWeatherObserver = AudioWeatherObserver(weatherStation)
    weatherStation.addObserver(audioWeatherObserver)
}