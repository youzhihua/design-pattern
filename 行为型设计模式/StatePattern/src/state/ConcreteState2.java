package state;

/**
 * 状态具体实现类2
 */
public class ConcreteState2 extends State{
    @Override
    public void handle() {
        System.out.println("状态2的handle()方法");
    }
}
