package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    protected Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
