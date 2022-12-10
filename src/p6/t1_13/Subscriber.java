package p6.t1_13;

public class Subscriber implements Subscribers{


    public void subscribe(Subscribable s) {
        s.subscribe(this);
    }


    public void unsubscribe(Subscribable s) {
        s.unsubscribe(this);
    }

    public void notifySubscriber() {
        System.out.println(this);
    }



}
