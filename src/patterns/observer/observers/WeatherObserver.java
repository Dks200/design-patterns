package patterns.observer.observers;

import patterns.observer.data.WeatherData;

public interface WeatherObserver {
  void update(WeatherData weatherData);
}
