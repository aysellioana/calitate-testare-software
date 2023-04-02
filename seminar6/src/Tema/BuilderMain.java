package Tema;

public class BuilderMain {

    /* Sa se implementeze un builder pentru crearea unui obiect de tip
    * Burger, avand campurile  ”tip de chifla”, ”carne”, ”sos”, ”legume” si ”condimente”.
    * Builderul trebuie sa ofere metode pentru a seta fiecare camp in parte, respectiv
    * ”setChifla(String)”, ”setCarne(String)”, ”setSos(String)”, ”setLegume(String)” si ”setCondimente(String)”.
    * De asemenea, builderul trebuie sa ofere o metoda build() pentru a crea obiectul Burger cu valorile
    * setate in campuri. Trebuie sa se asigure ca obiectul Burger creat are toate campurile setate corect.
    *   */
    public static void main(String[] args) {

        BurgerBuilder builder = new BurgerClasicBuilder();
        FastFood preparator  = new FastFood(builder);
        preparator.build();
        Burger burger = preparator.getBurger();
        burger.showDetails();
        System.out.println(burger.showDetails());

        builder = new BurgerExtraBuilder();
        preparator = new FastFood(builder);
        preparator.build();
        burger = preparator.getBurger();
        burger.showDetails();
        System.out.println(burger.showDetails());

    }
}
