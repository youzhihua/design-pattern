import factory.FlyweightFactory;
import flyweight.Flyweight;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getConcreteFlyweight("flyweight1");
        flyweight1.behavior();
        Flyweight flyweight1_1 = FlyweightFactory.getConcreteFlyweight("flyweight1");
        flyweight1_1.behavior();
        Flyweight flyweight2 = FlyweightFactory.getConcreteFlyweight("flyweight2");
        flyweight2.behavior();
        FlyweightFactory.getConcreteFlyweight("flyweight3");
    }
}
