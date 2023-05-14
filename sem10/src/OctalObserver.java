public class OctalObserver extends Observer {
    // Constructor
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    // Implementarea metodei abstracte din clasa Observer pentru afișarea stării subiectului în format octal
    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}