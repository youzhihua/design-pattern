package flyweight;

/**
 * 具体享元对象1
 */
public class ConcreteFlyweight1 extends Flyweight {
    @Override
    public void behavior() {
        System.out.println("这是具体享元对象1的行为");
    }
}
