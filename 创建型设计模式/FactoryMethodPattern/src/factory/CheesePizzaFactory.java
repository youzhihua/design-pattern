package factory;

import product.CheesePizza;
import product.Pizza;

/**
 * 芝士披萨工厂
 */
public class CheesePizzaFactory extends PizzaFactory {
    @Override
    public Pizza productPizza() {
        return new CheesePizza();
    }
}
