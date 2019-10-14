package context;

import state.State;

/**
 * 状态上下文
 */
public class Context {

    private State state;

    public Context(State state){
        this.state = state;
    }

    public void changeState(State state){
        this.state = state;
    }

    public void request(){
        state.handle();
    }
}
