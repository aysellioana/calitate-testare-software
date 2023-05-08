package Decorator;

public class OfflineViewingDecorator extends SubscriptionDecorator{
    //Decorator pentru adaugarea de optiune de vizionare offline
    public OfflineViewingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare offline";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 5.0;
    }
}
