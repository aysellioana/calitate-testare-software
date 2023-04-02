package Builder;

public class RezervareClient implements Rezervare{
    private String nume;
    private int nrPersoane;
    private  boolean asezareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setAseazareLaGeam(boolean aseazareLaGeam) {

        this.asezareLaGeam = aseazareLaGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {

        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareMasa(boolean decorareMasa) {

        this.decorareMasa = decorareMasa;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {

        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {

        this.genMuzica = genMuzica;
    }

    @Override
    public String showDetails() {
        return "RezervareClient{" +
                "nume='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", asezareLaGeam=" + asezareLaGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareMasa=" + decorareMasa +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }

}
