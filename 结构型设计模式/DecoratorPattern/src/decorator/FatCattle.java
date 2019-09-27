package decorator;

import food.ChafingDish;

/**
 * 配料肥牛的具体实现
 */
public class FatCattle extends Ingredients{
    public FatCattle(ChafingDish chafingDish) {
        super(chafingDish);
        this.price = 58.5;
        this.name = "肥牛";
    }
}
