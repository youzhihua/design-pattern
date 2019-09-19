package factory;

import product.Cake;
import product.Pizza;
import product.SalmonCake;
import product.SalmonPizza;

/**
 * 三文鱼工厂
 */
public class SalmonFactory extends FoodFactory {
    @Override
    public Pizza productPizza() {
        return new SalmonPizza();
    }

    @Override
    public Cake productCake() {
        return new SalmonCake();
    }
}
