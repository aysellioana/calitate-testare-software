package Proxy;

public class FilteredInternet implements Internet{
    Internet internet;
    @Override
    public void connect(String url) {
        if(!isAllowed(url)){
            if(internet==null){
                internet=new RealInternet();
            }
            internet.connect(url);
        }else{
            System.out.println("Acces to:"+url+" is blocked");
        }
    }

    private boolean isAllowed(String url){
        return !url.contains("socialmedia");
    }

}
