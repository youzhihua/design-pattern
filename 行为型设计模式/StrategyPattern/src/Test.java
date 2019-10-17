import context.Context;
import strategy.ConcreteStrategy1;
import strategy.ConcreteStrategy2;
import strategy.Strategy;

public class Test {

    public static void main(String[] args) {
        Context context = new Context();

        Strategy strategy1 = new ConcreteStrategy1();
        context.setStrategy(strategy1);
        context.operation();

        Strategy strategy2 = new ConcreteStrategy2();
        context.setStrategy(strategy2);
        context.operation();
    }
}
