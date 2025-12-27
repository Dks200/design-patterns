package patterns.observer.observable;

import patterns.observer.data.WeatherData;
import patterns.observer.observers.WeatherObserver;

public interface WeatherObservable {
  void addObserver(WeatherObserver observer);

  void removeObserver(WeatherObserver observer);

  void notifyObservers();

  void setWeatherData(WeatherData weatherData);
}
