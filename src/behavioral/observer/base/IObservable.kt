package behavioral.observer.base

interface IObservable {

    fun addObserver(observer: IObserver)

    fun removeObserver(observer: IObserver)

    fun notifyObservers()
}