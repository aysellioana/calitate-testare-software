package Prototype;


public class Main {
    public static void main(String[] args) {
        GenerareRezervare generareRezervare = new GenerareRezervare();
        Rezervare rez = generareRezervare.genereazaRezervare("client", "Ion", "Maria", "46");
    }
}
