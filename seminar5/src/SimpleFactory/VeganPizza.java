package SimpleFactory;


public class VeganPizza implements Pizza{
    @Override
    public void getTopping() {
        System.out.println("Vegan pizza");
    }
}