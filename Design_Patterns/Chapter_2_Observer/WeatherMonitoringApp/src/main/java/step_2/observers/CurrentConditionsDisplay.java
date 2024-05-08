package step_2.observers;

import step_2.subjects.WeatherData;


public class CurrentConditionsDisplay implements Observer, DisplayElement {
    float temperature;
    float humidity;
    float pressure;
    WeatherData weatherData;
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
        @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + " °F and " + humidity + " % humidity");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
