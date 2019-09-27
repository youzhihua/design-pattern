package component;

import food.ChafingDish;

/**
 * 番茄汤底火锅的具体实现
 */
public class TomatoSoupBase implements ChafingDish {
    @Override
    public void description() {
        System.out.println("火锅汤底----番茄汤底火锅");
    }
}
