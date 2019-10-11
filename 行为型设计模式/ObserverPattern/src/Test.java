import observer.ConcreteObserver;
import observer.Observer;
import subject.ConcreteSubject;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        Observer observer3 = new ConcreteObserver(subject);
        Observer observer4 = new ConcreteObserver(subject);

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.addObserver(observer4);

        subject.notifyObservers();

        System.out.println(observer1.getObserverState());
        System.out.println(observer2.getObserverState());
        System.out.println(observer3.getObserverState());
        System.out.println(observer4.getObserverState());
    }
}
