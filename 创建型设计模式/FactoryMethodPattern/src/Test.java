import factory.CheesePizzaFactory;
import factory.PizzaFactory;
import factory.SalmonPizzaFactory;
import product.Pizza;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建芝士披萨工厂
        PizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
        //创建芝士披萨
        Pizza cheesePizza = cheesePizzaFactory.productPizza();

        //创建三文鱼披萨工厂
        PizzaFactory salmonPizzaFactory = new SalmonPizzaFactory();
        //创建三文鱼披萨
        Pizza salmonPizza = salmonPizzaFactory.productPizza();

        cheesePizza.description();

        salmonPizza.description();
    }
}
