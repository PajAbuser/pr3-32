package p6.t1_13;

public interface Subscribers {

    void subscribe(Subscribable s);

    void unsubscribe(Subscribable s);

    void notifySubscriber();

}
