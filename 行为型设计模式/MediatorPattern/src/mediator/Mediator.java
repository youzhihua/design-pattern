package mediator;

import colleague.Colleague;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象中介类
 */
public abstract class Mediator {
    protected List<Colleague> colleagues;

    public Mediator(){
        colleagues = new ArrayList<>();
    }

    public void register(Colleague colleague){
        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    public abstract void behavior(Colleague colleague,String msg);
}
