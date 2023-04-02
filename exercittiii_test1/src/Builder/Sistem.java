package Builder;

public class Sistem {
    private RezervareBuilder builder;

    public Sistem(RezervareBuilder builder){
        this.builder = builder;
    }

    public void buildRezervare(){
        builder.buildName();
        builder.buildNrPersoane();
        if(builder instanceof RezervareClientBuilder){
            ((RezervareClientBuilder)builder).buildAsezareLaGeam();
            ((RezervareClientBuilder)builder).buildDecorareMasa();
            ((RezervareClientBuilder)builder).buildGenMuzica();
            ((RezervareClientBuilder) builder).buildScauneErgonomice();
            ((RezervareClientBuilder) builder).buildMuzicaAmbientala();
        }
    }
    public Rezervare getRezervare(){
        return builder.getRezervare();
    }
}
