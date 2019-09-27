package decorator;

import food.ChafingDish;

/**
 * 配料的抽象父类
 */
public abstract class Ingredients implements ChafingDish {

    protected ChafingDish chafingDish;

    protected Double price;

    protected String name;

    public Ingredients(ChafingDish chafingDish){
        this.chafingDish = chafingDish;
    }

    @Override
    public void description() {
        chafingDish.description();
        System.out.println(this.name+"--"+this.price);
    }
}
