import java.util.ArrayList;
import java.util.List;

public class Subject {
    // Lista de observatori
    private List<Observer> observers = new ArrayList<Observer>();
    // Starea subiectului
    private int state;

    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    // Metoda pentru a adăuga un observator în lista de observatori
    public void attach(Observer observer){
        observers.add(observer);
    }

    // Metoda care notifică toți observatorii din lista de observatori
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}