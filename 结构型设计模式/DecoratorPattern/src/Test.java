import component.ClearSoupBase;
import component.TomatoSoupBase;
import decorator.FatCattle;
import decorator.Fungus;
import decorator.Ingredients;
import food.ChafingDish;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //汤底
        ChafingDish clearSoupBase = new ClearSoupBase();
        ChafingDish tomatoSoupBase = new TomatoSoupBase();

        //小料
        Ingredients fatCattle = new FatCattle(clearSoupBase);
        Ingredients fungus = new Fungus(tomatoSoupBase);

        //描述
        fatCattle.description();
        fungus.description();
    }
}
