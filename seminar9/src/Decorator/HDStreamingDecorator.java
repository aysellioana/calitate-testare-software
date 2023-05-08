package Decorator;

public class HDStreamingDecorator extends SubscriptionDecorator{
//Decorator pentru adaugare optiune de vizionare in calitate HD
    public HDStreamingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", vizionare in calitate HD";
    }

    @Override
    public double getPrice() {
        return subscription.getPrice() + 3.0;
    }
}
