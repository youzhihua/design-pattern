import context.Context;
import state.ConcreteState1;
import state.ConcreteState2;
import state.State;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        State state1 = new ConcreteState1();

        Context context = new Context(state1);
        context.request();

        State state2 = new ConcreteState2();
        context.changeState(state2);
        context.request();
    }
}
