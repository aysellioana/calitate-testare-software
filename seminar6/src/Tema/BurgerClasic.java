package Tema;

public class BurgerClasic  implements  Burger{
    private String tipChifla;
    private String carne;
    private String sos;
    private String legume;
    private String condimente;
    private String gramajStandard;


    public void setTipChifla(String tipChifla) {
        this.tipChifla = tipChifla;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public void setLegume(String legume) {
        this.legume = legume;
    }

    public void setCondimente(String condimente) {
        this.condimente = condimente;
    }

    public void setGramajStandard(String gramajStandard) {
        this.gramajStandard = gramajStandard;
    }
    public String showDetails() {
        return "Burger{" +
                "tipChifla='" + tipChifla + '\'' +
                ", carne='" + carne + '\'' +
                ", sos='" + sos + '\'' +
                ", legume='" + legume + '\'' +
                ", condimente='" + condimente + '\'' +
                ", gramajStandard='" + gramajStandard + '\'' +
                '}';
    }
}
