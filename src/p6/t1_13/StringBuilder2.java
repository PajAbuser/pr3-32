package p6.t1_13;

import java.util.ArrayList;

public class StringBuilder2 implements Subscribable{

    ArrayList<Subscribers> subscribers = new ArrayList<>();

    private StringBuilder builder;

    public StringBuilder execute(){
        return builder;
    }

    public void notifySubscribers(){

        for(Subscribers subscriber : subscribers){
            subscriber.notifySubscriber();
        }

    }

    public void subscribe(Subscribers subscriber){

        if(!subscribers.contains(subscriber)) subscribers.add(subscriber);

    }

    public void unsubscribe(Subscribers subscriber){

        subscribers.remove(subscriber);

    }

}
