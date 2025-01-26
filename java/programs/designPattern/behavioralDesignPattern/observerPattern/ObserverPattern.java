package java.designPattern.behavioralDesignPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

public class ObserverPattern {
    private final List<Observer> subscribers = new ArrayList<>();

    public static void main(String[] args) {
        ObserverPattern channel = new ObserverPattern();
        Observer user1 = new Subscriber("User1");
        channel.subscribe(user1);
        channel.notifySubscribers("New Video Uploaded");
    }

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void notifySubscribers(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
