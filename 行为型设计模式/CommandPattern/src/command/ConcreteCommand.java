package command;

import receiver.Receiver;

/**
 * 具体命令类
 */
public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void action() {
        receiver.execute();
    }
}
