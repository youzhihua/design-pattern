package factory;

import product.Pizza;
import product.SalmonPizza;

/**
 * 三文鱼披萨工厂
 */
public class SalmonPizzaFactory extends PizzaFactory {
    @Override
    public Pizza productPizza() {
        return new SalmonPizza();
    }
}
