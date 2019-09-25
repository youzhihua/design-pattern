import adaptee.DuckAdaptee;
import adapter.DuckAdapter;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        DuckAdaptee duckAdaptee = new DuckAdaptee();

        DuckAdapter duckAdapter = new DuckAdapter(duckAdaptee);

        duckAdapter.fly();

        duckAdapter.quack();
    }
}
