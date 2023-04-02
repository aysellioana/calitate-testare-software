package Tema;

public class FastFood {
    BurgerBuilder builder;

    FastFood(BurgerBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.buildCarne();
        builder.buildCondimente();
        builder.buildTipChifla();
        builder.buildLegume();
        builder.buildSos();
        if(builder instanceof BurgerExtraBuilder)
            ((BurgerExtraBuilder)builder).buildOptiuniExtra();
        else
            ((BurgerClasicBuilder)builder).buildGramajStandard();
    }

    public Burger getBurger() {
        return builder.getBurger();
    }
}
