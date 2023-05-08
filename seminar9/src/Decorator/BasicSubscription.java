package Decorator;

public class BasicSubscription implements Subscription{
//Implementarea de baza a unui abonament
    @Override
    public String getDescription() {
        return "Abonament de baza";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
