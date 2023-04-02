package Tema;

public interface BurgerBuilder {
    void buildTipChifla();
    void buildCarne();
    void buildSos();
    void buildLegume();
    void buildCondimente();

    public Burger getBurger();
}
