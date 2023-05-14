public class HexaObserver extends Observer {
    // Constructor
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    // Implementarea metodei abstracte din clasa Observer pentru afișarea stării subiectului în format hexazecimal
    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}