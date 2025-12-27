package patterns.observer.observers.impl;

import patterns.observer.data.WeatherData;
import patterns.observer.observers.WeatherObserver;

public class CurrentDisplayObserver implements WeatherObserver {

  @Override
  public void update(WeatherData weatherData) {
    System.out.println("Current weather display: Temperature - " + weatherData.getTemperature() + " Humidity - " + weatherData.getHumidity());
  }
}
