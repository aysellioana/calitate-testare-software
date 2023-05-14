public class Main {
    public static void main(String[] args) {
        // Se crează o instanță a clasei Subject
        Subject subject = new Subject();

        // Se crează 3 instanțe ale claselor care extind clasa Observer
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        // Se setează starea subiectului la 15 și se apelează metoda notifyAllObservers() pentru a afișa valorile înregistrate de observatori
        System.out.println("First state change: 15");
        subject.setState(15);

        // Se setează starea subiectului la 10
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
