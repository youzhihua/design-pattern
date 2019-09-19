package factory;

import product.CheesePizza;
import product.Pizza;
import product.SalmonPizza;

/**
 * 披萨工厂的抽象父类
 */
public abstract class PizzaFactory {

    public abstract Pizza productPizza();

}
