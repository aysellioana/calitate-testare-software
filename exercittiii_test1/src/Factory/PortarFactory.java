package Factory;

public class PortarFactory implements JucatorFactory{

    @Override
    public Jucator createJucator() {
        return new Portat();
    }
}
