package patterns.observer.observable.impl;

import patterns.observer.data.WeatherData;
import patterns.observer.observable.WeatherObservable;
import patterns.observer.observers.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherObservable {
  private final List<WeatherObserver> observers = new ArrayList<>();
  private WeatherData weatherData;


  @Override
  public void addObserver(WeatherObserver observer) {
    assert observer != null;
    observers.add(observer);
  }

  @Override
  public void removeObserver(WeatherObserver observer) {
    assert observer != null;
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(weatherObserver -> weatherObserver.update(weatherData));
  }

  @Override
  public void setWeatherData(WeatherData weatherData) {
    System.out.println("Weather data is updated");
    this.weatherData = weatherData;
    notifyObservers();
  }
}
