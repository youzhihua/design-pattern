package colleague;

import mediator.Mediator;

/**
 * 抽象同事类
 */
public abstract class Colleague {

    protected Mediator mediator;

    public void receiveMsg(String str){
        System.out.println(str);
    }

    public abstract void sendMsg(Colleague colleague,String str);

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
