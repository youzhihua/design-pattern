package colleague;

/**
 * 具体同事类2
 */
public class ConcreteColleague2 extends Colleague {
    @Override
    public void sendMsg(Colleague colleague, String str) {
        this.mediator.behavior(colleague,str);
    }
}
