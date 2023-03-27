package SimpleFactory;

public class CheesePizza implements Pizza{


    public CheesePizza() {
    }

    @Override
    public void getTopping() {
        System.out.println("Pizza with cheese");
    }
}