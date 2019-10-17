package context;

import strategy.Strategy;

/**
 * 环境类
 */
public class Context {

    private Strategy strategy;

    public void operation(){
        strategy.algorithm();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

}
