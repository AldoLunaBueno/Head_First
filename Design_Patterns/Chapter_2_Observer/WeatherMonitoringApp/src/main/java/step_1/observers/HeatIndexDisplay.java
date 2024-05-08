package step_1.observers;

import step_1.subjects.WeatherData;

import static java.lang.Math.pow;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private double heatIndex;
    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temperature, float humidity, float pressure) {
        float T = temperature, T2 = T*T, T3 = T2*T;
        float RH = humidity, RH2 = RH*RH, RH3 = RH2*RH;

        this.heatIndex = 16.923 + 1.85212 * pow(10, -1) * T + 5.37941 * RH - 1.00254 * pow(10, -1) *
                T * RH + 9.41695 * pow(10, -3) * T2 + 7.28898 * pow(10, -3) * RH2 + 3.45372 *
                pow(10,-4) * T2 * RH - 8.14971 * pow(10, -4) * T * RH2 + 1.02102 * pow(10, -5) * T2 *
                RH2 - 3.8646 * pow(10, -5) * T3 + 2.91583 * pow(10, -5) * RH3 + 1.42721 * pow(10, -6)
                * T3 * RH + 1.97483 * pow(10, -7) * T * RH3 - 2.18429 * pow(10, -8) * T3 * RH2
                + 8.43296 * pow(10, -10) * T2 * RH3 - 4.81975 * pow(10, -11) * T3 * RH3;
        display();
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
}
