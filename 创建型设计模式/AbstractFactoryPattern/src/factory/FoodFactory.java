package factory;

import product.Cake;
import product.Pizza;

/**
 * 食品工厂的抽象父类
 */
public abstract class FoodFactory {

    public abstract Pizza productPizza();

    public abstract Cake productCake();

}
