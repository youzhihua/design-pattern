package observer;

import subject.Subject;

/**
 * 抽象观察者
 */
public abstract class Observer {

    protected Subject subject;

    public Observer(Subject subject){
        this.subject = subject;
    }

    public abstract void update();

    public Integer getObserverState(){
        return subject.getState();
    }
}
