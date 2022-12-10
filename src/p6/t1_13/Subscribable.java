package p6.t1_13;

public interface Subscribable {

    public void notifySubscribers();

    public void subscribe(Subscribers subscriber);

    public void unsubscribe(Subscribers subscriber);

}
