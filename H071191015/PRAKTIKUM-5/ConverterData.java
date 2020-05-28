public class ConverterData extends Converter implements Data{

    @Override
    public void start(){
        System.out.println("Data Converter is started");
    }

    @Override
    public long teraToGiga(long value) {
        long toGiga = value*1024;
        return toGiga;
    }

    @Override
    public long teraToMega(long value) {
        long toMega = value*1048576;
        return toMega;
    }

    @Override
    public long teraToKilo(long value) {
        long toKilo = value*1073741824;
        return toKilo;
    }

    @Override
    public void stop(){
        System.out.println("Data Converter is terminate");
    }
}