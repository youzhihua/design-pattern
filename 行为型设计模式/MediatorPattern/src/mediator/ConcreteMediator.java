package mediator;

import colleague.Colleague;

/**
 * 具体中介类
 */
public class ConcreteMediator extends Mediator{
    @Override
    public void behavior(Colleague colleague, String msg) {
        if(colleagues.contains(colleague)){
            colleague.receiveMsg(msg);
        }else{
            System.out.println("该对象不在中介类可联系的范围");
        }
    }
}
