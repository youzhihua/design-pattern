package decorator;

import food.ChafingDish;

/**
 * 配料木耳的具体实现
 */
public class Fungus extends Ingredients {
    public Fungus(ChafingDish chafingDish) {
        super(chafingDish);
        this.price = 10.0;
        this.name = "木耳";
    }
}
