package factory;

import product.CheesePizza;
import product.Pizza;
import product.SalmonPizza;

/**
 * 披萨工厂类
 */
public class PizzaFactory {

    public static Pizza productPizza(String name){
        if("Cheese".equals(name))
            return new CheesePizza();
        else if("Salmon".equals(name))
            return new SalmonPizza();
        return null;
    }

}
