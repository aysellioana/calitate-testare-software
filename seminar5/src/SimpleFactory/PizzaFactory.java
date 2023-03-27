package SimpleFactory;

public class PizzaFactory {
    public static Pizza createPizza(PizzaType pizzaType ) throws Exception {
        switch (pizzaType) {
            case Cheese:
                return new CheesePizza();
            case Pepperoni:
                return new PepperoniPizza();
            case Vegan:
                return new VeganPizza();
            default:
                throw new Exception("Tipul primit nu este corect");
        }
    }
}