package decorator;

import food.ChafingDish;

public class FatCattle extends Ingredients{
    public FatCattle(ChafingDish chafingDish) {
        super(chafingDish);
        this.price = 58.5;
        this.name = "肥牛";
    }
}
