public class CalculatorData extends Converter implements Data {

    @Override
    public void start() {
        System.out.println("Data Converter is started");
    }

    @Override
    public void stop() {
        System.out.println("Data Converter is terminated");
    }

    long temp = 1024;

    @Override
    public long teraToGiga(long Value) {
        return Value * temp;
    }

    @Override
    public long teraToMega(long Value) {
        return Value * temp * temp;
    }

    @Override
    public long teraToKilo(long Value) {
        return (long) (Value * Math.pow(temp, 3));
    }
}
