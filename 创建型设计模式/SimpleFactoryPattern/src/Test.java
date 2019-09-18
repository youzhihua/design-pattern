import factory.PizzaFactory;
import product.Pizza;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {

        //生产芝士披萨
        Pizza cheesePizza = PizzaFactory.productPizza("Cheese");
        cheesePizza.description();

        //生产三文鱼披萨
        Pizza salmonPizza = PizzaFactory.productPizza("Salmon");
        salmonPizza.description();

        //生产xxx披萨。。。。

    }
}
