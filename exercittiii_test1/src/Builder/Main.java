package Builder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareClientBuilder();
        Sistem rezervare = new Sistem(builder);
        rezervare.buildRezervare();
        Rezervare rez = rezervare.getRezervare();
        rez.showDetails();
        System.out.println(rez.showDetails());
    }
}
