public abstract class Observer {
    // Referință la subiectul
    protected Subject subject;
    // Metoda care va fi implementată de către toți observatorii
    public abstract void update();
}