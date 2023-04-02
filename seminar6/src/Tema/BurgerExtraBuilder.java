package Tema;

public class BurgerExtraBuilder implements BurgerBuilder{
    Burger burger;

    BurgerExtraBuilder() {
        this.burger = new BurgerExtra();
    }

    @Override
    public void buildTipChifla() {
        this.burger.setTipChifla("CHIFLA BURGER EXTRA");
    }

    @Override
    public void buildCarne() {
        this.burger.setCarne("CARNE BURGER EXTRA");
    }

    @Override
    public void buildSos() {
        this.burger.setSos("SOS BURGER EXTRA");
    }

    @Override
    public void buildLegume() {
        this.burger.setLegume("LEGUME BURGER EXTRA");
    }

    @Override
    public void buildCondimente() {
        this.burger.setCondimente("CONDIMENTE BURGER EXTRA");
    }

    public void buildOptiuniExtra() {
        ((BurgerExtra)burger).setOptiuniExtra("OPTIUNE EXTRA BURGER");
    }
    @Override
    public Burger getBurger() {
        return this.burger;
    }
}
