import Adapter.JsonParser;
import Adapter.XmlParser;
import Adapter.XmlToJsonAdapter;
import Facade.ShapeMaker;
import Facade_ex2.DealerAuto;

public class Main {
    public static void main(String[] args) {

        System.out.println("Adaptor:");
        XmlParser xmlParser = new XmlParser();
        JsonParser jsonParser = new XmlToJsonAdapter(xmlParser);
        jsonParser.parseJson("STRING");

        System.out.println("\nFacade:");
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();

        System.out.println("\nFacade Ex2:");
        DealerAuto dealerAuto=new DealerAuto();
        System.out.println(dealerAuto.descriereMasinaFamilie());
    }
}