public class FabricaMasini {
    String model;
    int id;

    private static FabricaMasini instance;

    private FabricaMasini()
    {
        model = null;
        id=0;
    }

    public static FabricaMasini getInstance()
    {
        if(instance==null){
            instance = new FabricaMasini();
            return instance;
        }
        return instance;
    }


}
