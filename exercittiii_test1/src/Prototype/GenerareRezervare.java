package Prototype;

import java.util.HashMap;
import java.util.Map;

public class GenerareRezervare {
    private static Map<String, Rezervare> rezervari = new HashMap<>();

    public GenerareRezervare(){
        rezervari.put("rezervari", new RezervareRestaurant());
    }

    public Rezervare genereazaRezervare(String client, String nume, String prenume, String varsta) {
        try {
            Rezervare rezervare = rezervari.get(client).clone();
            rezervare.setNume(nume);
            rezervare.setPrenume(prenume);
            rezervare.setVarsta(varsta);
            rezervare.generareRezervare();
            return rezervare;
        } catch (CloneNotSupportedException e) {
            System.out.println("Error " + e.getMessage());
            return null;

        }
    }
}
