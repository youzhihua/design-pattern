package strategy;

/**
 * 具体策略1
 */
public class ConcreteStrategy1 extends Strategy{
    @Override
    public void algorithm() {
        System.out.println("这是策略1的计算方法");
    }
}
