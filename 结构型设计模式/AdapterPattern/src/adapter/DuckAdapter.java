package adapter;

/**
 * 鸭子适配器
 */
public class DuckAdapter implements Duck{

    private Duck duck;

    public DuckAdapter(Duck duck){
        this.duck = duck;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            duck.fly();
        }
    }

    @Override
    public void quack() {
        for (int i = 0; i < 5; i++) {
            duck.quack();
        }
    }
}
