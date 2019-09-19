package factory;

import product.Cake;
import product.CheeseCake;
import product.CheesePizza;
import product.Pizza;

/**
 * 芝士工厂
 */
public class CheeseFactory extends FoodFactory {
    @Override
    public Pizza productPizza() {
        return new CheesePizza();
    }

    @Override
    public Cake productCake() {
        return new CheeseCake();
    }
}
