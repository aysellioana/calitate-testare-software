package Builder;

public class RezervareClientBuilder implements RezervareBuilder{
    private Rezervare rezervare;
    public RezervareClientBuilder(){
        this.rezervare = new RezervareClient();
    }
    @Override
    public void buildName() {
        this.rezervare.setNume("nume");
    }

    @Override
    public void buildNrPersoane() {
        this.rezervare.setNrPersoane(8);
    }

    public void buildAsezareLaGeam(){
        ((RezervareClient)rezervare).setAseazareLaGeam(true);
    }
    public void buildScauneErgonomice(){
        ((RezervareClient)rezervare).setScauneErgonomice(false);
    }
    public void buildDecorareMasa(){
        ((RezervareClient)rezervare).setDecorareMasa(true);
    }
    void buildMuzicaAmbientala() {

        ((RezervareClient)rezervare).setMuzicaAmbientala(false);
    }
    void buildGenMuzica() {

        ((RezervareClient)rezervare).setGenMuzica("Muzica usoara");
    }

    @Override
    public Rezervare getRezervare() {
        return this.rezervare;
    }
}
