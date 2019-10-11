import command.Command;
import command.ConcreteCommand;
import invoker.Invoker;
import receiver.Receiver;

import java.net.URLEncoder;
import java.security.Security;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.behavior();

        Security.getAlgorithms("des");
    }
}
