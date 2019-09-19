import factory.CheeseFactory;
import factory.FoodFactory;
import factory.SalmonFactory;
import product.Cake;
import product.CheeseCake;
import product.Pizza;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建芝士工厂
        FoodFactory cheeseFactory = new CheeseFactory();
        //创建三文鱼工厂
        FoodFactory salmonFactory = new SalmonFactory();
        //创建芝士蛋糕
        Cake cheeseCake = cheeseFactory.productCake();
        //创建芝士披萨
        Pizza cheesePizza = cheeseFactory.productPizza();
        //创建三文鱼蛋糕
        Cake salmonCake = salmonFactory.productCake();
        //创建三文鱼披萨
        Pizza salmonPizza = salmonFactory.productPizza();

        cheeseCake.description();
        cheesePizza.description();
        salmonCake.description();
        salmonPizza.description();
    }
}
