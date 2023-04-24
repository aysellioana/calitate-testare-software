package Facade_ex2;

public class DealerAuto {
    private MasinaFamilie masinaFamilie;
    private MasinaSport masinaSport;
    private MasinaElectrica masinaElectrica;
    public DealerAuto() {
        masinaElectrica=new MasinaElectrica("Descriere masina electrica");
        masinaSport=new MasinaSport("Descriere masina sport");
        masinaFamilie=new MasinaFamilie("Descriere masina familie");
    }

    public String descriereMasinaSport(){
        return masinaSport.descriere();
    }
    public String descriereMasinaFamilie(){
        return masinaFamilie.descriere();
    }
    public String descriereMasinaElectrica(){
        return masinaElectrica.descriere();
    }
}