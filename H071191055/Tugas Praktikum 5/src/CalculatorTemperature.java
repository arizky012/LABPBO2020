public class CalculatorTemperature extends Converter implements Temperature{

    @Override
    public void start() {
        System.out.println("Temperature Converter is started");
    }

    @Override
    public void stop() {
        System.out.println("Temperature Converter is terminated");
    }

    @Override
    public double celsiusToFahrenheit(double value) {
        return (value * 9/5) + 32;
    }

    @Override
    public double celsiusToKelvin(double value) {
        return value + 273.15;
    }
}
