package observer;

import subject.Subject;

/**
 * 具体观察者
 */
public class ConcreteObserver extends Observer {

    public ConcreteObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        subject.setState(1);
    }
}
