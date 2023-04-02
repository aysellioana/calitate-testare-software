package Tema;

public class BurgerClasicBuilder implements BurgerBuilder{
    Burger burger;
    BurgerClasicBuilder() {
        this.burger = new BurgerClasic();
    }

    @Override
    public void buildTipChifla() {
        this.burger.setTipChifla("CHIFLA BURGER CLASIC");
    }

    @Override
    public void buildCarne() {
        this.burger.setCarne("CARNE BURGER CLASIC");
    }

    @Override
    public void buildSos() {
        this.burger.setSos("SOS BURGER CLASIC");
    }

    @Override
    public void buildLegume() {
        this.burger.setLegume("LEGUME BURGER CLASIC");
    }

    @Override
    public void buildCondimente() {
        this.burger.setCondimente("CONDIMENTE BURGER CLASIC");
    }

    public void buildGramajStandard() {
        ((BurgerClasic)burger).setGramajStandard("GRAMAJ STANDARD BURGER CLASIC");
    }
    @Override
    public Burger getBurger() {
        return this.burger;
    }
}
