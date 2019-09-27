package component;

import decorator.Ingredients;
import food.ChafingDish;

/**
 * 清汤火锅的具体实现
 */
public class ClearSoupBase implements ChafingDish {
    @Override
    public void description() {
        System.out.println("火锅汤底----清汤火锅");
    }
}
