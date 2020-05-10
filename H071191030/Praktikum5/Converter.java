abstract class Converter {

    public abstract void start();

    public abstract void stop();
}

interface Temperature {
    double celciusToFahrenheit(double value);// methodd nya sdh public dan abstract

    double celciusToKelvin(double value);
}

interface Data {

    long teraToGiga(long value);

    long teraToMega(long value);

    long teraToKilo(long value);
}

interface Distance {

    double metreToKilo(double value);

    double metreToMilli(double value);

    double inchToMetre(double value);

}

class ConverterTemperature extends Converter implements Temperature {

    public void start() {
        System.out.println("Temperature Converter is started");
    }

    public double celciusToFahrenheit(double value) {

        return value * 1.8 + 32;

    }

    public double celciusToKelvin(double value) {
        return value + 273.15;

    }

    public void stop() {
        System.out.println("Temperature Converter is terminated");
    }

}

class ConverterDistance extends Converter implements Distance {

    public void start() {
        System.out.println("Distance Converter is started");
    }

    public double inchToMetre(double value) {
        return value * 0.0254;

    }

    public double metreToKilo(double value) {
        return value / 1000;

    }

    public double metreToMilli(double value) {
        return value * 1000;

    }

    public void stop() {
        System.out.println("Distance Converter is terminated");
    }

}

class ConverterData extends Converter implements Data {

    public void start() {
        System.out.println("Data Converter is started");
    }

    public long teraToGiga(long value) {
        return value * 1024;

    }

    public long teraToMega(long value) {
        return value * (1024 * 1024);

    }

    public long teraToKilo(long value) {
        return value * (1024 * 1024 * 1024);

    }

    public void stop() {
        System.out.println("Data Converter is terminated");

    }
}