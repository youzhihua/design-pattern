package component;

import decorator.Ingredients;
import food.ChafingDish;

public class ClearSoupBase implements ChafingDish {
    @Override
    public void description() {
        System.out.println("火锅汤底----清汤火锅");
    }
}
