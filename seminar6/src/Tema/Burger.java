package Tema;

public interface Burger {
    void setTipChifla(String tipChifla);
    void setCarne(String carne);
    void setSos(String sos);
    void setLegume(String legume);
    void setCondimente(String condimente);

    public String showDetails();
}
