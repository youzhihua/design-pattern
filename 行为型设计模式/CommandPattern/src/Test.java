import command.Command;
import command.ConcreteCommand;
import invoker.Invoker;
import receiver.Receiver;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.behavior();
    }
}
