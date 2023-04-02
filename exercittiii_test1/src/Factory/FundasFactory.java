package Factory;

public class FundasFactory implements JucatorFactory{
    @Override
    public Jucator createJucator() {
        return new Fundas();
    }
}
