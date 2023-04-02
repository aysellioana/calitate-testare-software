package Prototype;

public class RezervareRestaurant implements Rezervare{
    private String nume;
    private String prenume;
    private String varsta;


    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    @Override
    public void generareRezervare() {
        System.out.println("Rezervarea este facuta pe numele" + nume + prenume + "are varsta " + varsta);
    }

    @Override
    public Rezervare clone() throws CloneNotSupportedException {
        return (RezervareRestaurant)super.clone();
    }
}
