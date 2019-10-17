package colleague;

/**
 * 具体同事类1
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void sendMsg(Colleague colleague, String str) {
        this.mediator.behavior(colleague,str);
    }
}
