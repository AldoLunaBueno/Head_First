package step_1.observers;

import step_1.subjects.WeatherData;


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
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
