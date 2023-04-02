package Factory;

public class AtacantFactory implements JucatorFactory{
    @Override
    public Jucator createJucator() {
        return new Atacant();
    }
}
