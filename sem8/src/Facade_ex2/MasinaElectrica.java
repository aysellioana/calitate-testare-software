package Facade_ex2;

public class MasinaElectrica implements Automobil{
    String descriere;

    public MasinaElectrica(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public String descriere() {
        return descriere;
    }
}