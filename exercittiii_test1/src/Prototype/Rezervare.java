package Prototype;

public interface Rezervare {
    public void setNume(String nume);
    public void setPrenume(String prenume);
    public void setVarsta(String varsta);
    public void generareRezervare();
    public Rezervare clone() throws CloneNotSupportedException;
}
