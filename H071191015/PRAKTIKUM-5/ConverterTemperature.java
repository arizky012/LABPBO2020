public class ConverterTemperature extends Converter implements Temperature{
    
    @Override
    public void start(){
        System.out.println("Temperature Converter is started");
    }

    @Override
    public void stop(){
        System.out.println("Temperature Converter is terminate");
    }

    @Override
    public double celciusToFahrenheit(double value) {
        double toFahrenheit = ((9*value)/5)+32;
        return toFahrenheit;
    }

    @Override
    public double celciusToKelvin(double value) {
        double toKelvin = value + 273.15;
        return toKelvin;
    }
}