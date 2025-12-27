package patterns.observer;

import patterns.observer.data.WeatherData;
import patterns.observer.observable.impl.WeatherStation;
import patterns.observer.observers.WeatherObserver;
import patterns.observer.observers.impl.CurrentDisplayObserver;
import patterns.observer.observers.impl.ForecastDisplayObserver;

public class WeatherStationApp {

  public static void main(String[] args) {
    WeatherStation weatherStation = new WeatherStation();

    WeatherObserver observer1 = new CurrentDisplayObserver();
    WeatherObserver observer2 = new ForecastDisplayObserver();

    System.out.println("Before observers are added, no data printed");
    weatherStation.setWeatherData(new WeatherData(35, 26));
    System.out.println("============================================");

    weatherStation.addObserver(observer1);
    weatherStation.addObserver(observer2);

    System.out.println("After observers are added, data is printed");
    weatherStation.setWeatherData(new WeatherData(30, 28));
  }
}
