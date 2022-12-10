package p6.t1_13;

public class Main {
    public static void main(String[] args) {

        Subscriber
            subscriber1 = new Subscriber(),
            subscriber2 = new Subscriber(),
            subscriber3 = new Subscriber(),
            subscriber4 = new Subscriber(),
            subscriber5 = new Subscriber(),
            subscriber6 = new Subscriber(),
            subscriber7 = new Subscriber(),
            subscriber8 = new Subscriber();

        StringBuilder2 stringBuilder2 = new StringBuilder2();

        subscriber1.subscribe(stringBuilder2);
        subscriber3.subscribe(stringBuilder2);
        subscriber5.subscribe(stringBuilder2);
        subscriber8.subscribe(stringBuilder2);

        stringBuilder2.notifySubscribers();

        System.out.println();

        subscriber1.unsubscribe(stringBuilder2);
        subscriber8.unsubscribe(stringBuilder2);

        stringBuilder2.notifySubscribers();

    }
}
