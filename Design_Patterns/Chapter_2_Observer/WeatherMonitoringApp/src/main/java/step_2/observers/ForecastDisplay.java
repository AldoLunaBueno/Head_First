package step_2.observers;

import step_2.subjects.Subject;
import step_2.subjects.WeatherData;

public class ForecastDisplay implements
        Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure ;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if(currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        } else if(currentPressure == lastPressure) {
            System.out.println("More of the same");
        }
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
