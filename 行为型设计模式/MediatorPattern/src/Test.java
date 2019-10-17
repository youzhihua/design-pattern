import colleague.Colleague;
import colleague.ConcreteColleague1;
import colleague.ConcreteColleague2;
import mediator.ConcreteMediator;
import mediator.Mediator;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1();
        Colleague colleague2 = new ConcreteColleague2();

        mediator.register(colleague1);
        mediator.register(colleague2);

        colleague1.sendMsg(colleague2,"你好，这是colleague1发来的打招呼信息");
        colleague1.sendMsg(colleague1,"你好，这是colleague2发来的打招呼信息");
    }
}
