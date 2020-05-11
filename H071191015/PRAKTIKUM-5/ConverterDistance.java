public class ConverterDistance extends Converter implements Distance {

    @Override
    public void start(){
        System.out.println("Distance Converter is started");
    }

    @Override
    public void stop(){
        System.out.println("Distance Converter is terminate");
    }

    @Override
    public double metreToKilo(double value) {
        double toKilo = value/1000;
        return toKilo;
    }

    @Override
    public double metreToMili(double value) {
        double toMili = value*1000;
        return toMili;
    }

    @Override
    public double inchToMetre(double value) {
        double toMetre = value*0.0254;
        return toMetre;
    }
}