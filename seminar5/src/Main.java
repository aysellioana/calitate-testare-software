import AbstractFactory.GUIFactory;
import AbstractFactory.MacGUIFactory;
import AbstractFactory.WindowsGUIFactory;
import FactoryMethod.Cat;
import FactoryMethod.CatFactory;
import FactoryMethod.Dog;
import FactoryMethod.DogFactory;
import SimpleFactory.CheesePizza;
import SimpleFactory.PizzaFactory;
import SimpleFactory.PizzaType;
import SimpleFactory.VeganPizza;

public class Main {
    public static void main(String[] args) throws Exception {

        //simple factory
          CheesePizza cheesePizza = null;
          cheesePizza= (CheesePizza) PizzaFactory.createPizza(PizzaType.Cheese);
          cheesePizza.getTopping();

          VeganPizza veganPizza =null;
          veganPizza= (VeganPizza) PizzaFactory.createPizza(PizzaType.Vegan);
          veganPizza.getTopping();


        //factory method
        DogFactory dogFactory = new DogFactory();
        Dog dog= (Dog) dogFactory.createAnimal();

        CatFactory catFactory = new CatFactory();
        Cat cat = (Cat) catFactory.createAnimal();

        //abstract factory
        GUIFactory g1, g2,g3,g4;
        g1 = new WindowsGUIFactory();
        g1.createButton();

        g2 = new WindowsGUIFactory();
        g2.createMenu();

        g3 = new MacGUIFactory();
        g3.createMenu();
        g4 = new MacGUIFactory();
        g4.createButton();

    }
}