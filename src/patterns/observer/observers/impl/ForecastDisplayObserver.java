package patterns.observer.observers.impl;

import patterns.observer.data.WeatherData;
import patterns.observer.observers.WeatherObserver;

public class ForecastDisplayObserver implements WeatherObserver {

  @Override
  public void update(WeatherData weatherData) {
    System.out.println("Forecast weather display: Temperature - " + weatherData.getTemperature() + " Humidity - " + weatherData.getHumidity());
  }
}
