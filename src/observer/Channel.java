package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    public List<Observer> observers = new ArrayList<Observer>();

    public void addNewObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for(Observer observer : observers) {
            observer.update(message);
        }
    }
}
