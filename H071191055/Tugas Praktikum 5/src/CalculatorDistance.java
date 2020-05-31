public class CalculatorDistance extends Converter implements Distance{

    @Override
    public void start() {
        System.out.println("Distance Converter is started");
    }

    @Override
    public void stop() {
        System.out.println("Distance Converter is terminated");
    }

    @Override
    public double metreToMilli(double Value) {
        return Value * 1000;
    }

    @Override
    public double metreToKilo(double Value) {
        return Value / 1000;
    }

    @Override
    public double inchToMetre(double Value) {
        return Value * 0.0254;
    }
}
