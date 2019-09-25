package adaptee;

import adapter.Duck;

/**
 * 鸭子类  被适配
 */
public class DuckAdaptee implements Duck {

    public void fly(){
        System.out.println("鸭子飞了10m");
    }

    public void quack(){
        System.out.println("ga ga ga 三声");
    }
}
