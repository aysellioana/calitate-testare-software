public class Main {
    public static void main(String[] args) {

        //Server server = new Server();
      Server server =Server.getInstance();
      System.out.println(server.showStatus());


        //instanta unica
        //nu putem crea obiecte noi
        //constructor privat



        // O  fabrica de masini care implementeaza un sistem centralizat de monitorizare a productei.
        // Sistemul trebuie sa asigure adaugarea si modificarea datelor despre masinile fabricate la niveluol sediului central,
        //intr-un mediu securizat(sistemul va exista sub forma unui server dispus in datacenter-ul din HQ).
        //Programatorii trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi manageriate
        //prin intermediul singurului server mentionat anterior.

        FabricaMasini.getInstance();

        //Identificare instanta:
        //va exista sub forma unui server
        // - sistemul nu va putea fi replicat
        //singurului server mentionat anterior.
    }
}