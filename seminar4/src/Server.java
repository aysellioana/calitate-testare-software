public class Server {
    int portNr;
    String name;
    private static Server instance;
    private Server()
    {
        this.portNr = 0;
        this.name = null;
    }
    public static Server getInstance()
    {
        if(instance==null){
            instance = new Server();
            return Server.instance;
        }
        return Server.instance;
    }

    public String showStatus()
    {
        return "Serverul ruleaza pe portul " + portNr;
    }
}
