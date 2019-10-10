package invoker;

import command.Command;

/**
 * 调用者
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void behavior(){
        command.action();
    }
}
