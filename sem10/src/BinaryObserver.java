public class BinaryObserver extends Observer {
    // Constructor
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    // Implementarea metodei abstracte din clasa Observer pentru afișarea stării subiectului în format binar
    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}