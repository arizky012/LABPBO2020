public class Main {
    public static void main(String[] args) {
        ConverterData data = new ConverterData();
        data.start();
        if (data.teraToGiga(9) == 9216) {
            System.out.println("Terabyte To Gigabyte = OK");
            if (data.teraToMega(16) == 16777216) {
                System.out.println("Terabyte To Megabyte = OK");
                if (data.teraToKilo(1) == 1073741824) {
                    System.out.println("Terabyte To Kilobyte = OK");
                } else {
                    System.out.println("Terabyte To Kilobyte = INCORRECT");
                    return;
                }
            } else {
                System.out.println("Terabyte To Megabyte = INCORRECT");
                return;
            }
        } else {
            System.out.println("Terabyte To Gigabyte = INCORRECT");
            return;
        }
        data.stop();
        System.out.println();

        ConverterTemperature temp = new ConverterTemperature();
        temp.start();
        if (temp.celciusToFahrenheit(9) == 48.2) {
            System.out.println("Celcius To Fahrenheit = OK");
            if (temp.celciusToKelvin(11) == 284.15) {
                System.out.println("Celcius To Kelvin = OK");
            } else {
                System.out.println("Celcius To Kelvin = INCORRECT");
                return;
            }
        } else {
            System.out.println("Celcius To Fahrenheit = INCORRECT");
            return;
        }
        temp.stop();
        System.out.println();

        ConverterDistance disc = new ConverterDistance();
        disc.start();
        if (disc.inchToMetre(1) == 0.0254) {
            System.out.println("Inch To Metre = OK");
            if (disc.metreToKilo(12500) == 12.5) {
                System.out.println("Metre To Kilometre = OK");
                if (disc.metreToMili(12.9) == 12900) {
                    System.out.println("Metre To Milimetre = OK");
                } else {
                    System.out.println("Metre To Milietre = INCORRECT");
                    return;
                }
            } else {
                System.out.println("Metre To Kilometre = INCORRECT");
                return;
            }
        } else {
            System.out.println("Inch To Metre = INCORRECT");
            return;
        }
        disc.stop();
        System.out.println();
    }
}