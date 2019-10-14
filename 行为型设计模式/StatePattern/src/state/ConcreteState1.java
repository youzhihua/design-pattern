package state;

/**
 * 状态具体实现类1
 */
public class ConcreteState1 extends State{
    @Override
    public void handle() {
        System.out.println("状态1的handle()方法");
    }
}
