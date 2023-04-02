package Factory;

public class Main {
    public static void main(String[] args) {
       FundasFactory fundas = new FundasFactory();
       fundas.createJucator();

       PortarFactory portar = new PortarFactory();
       portar.createJucator();


       AtacantFactory atacant = new AtacantFactory();
        atacant.createJucator();
    }
}
