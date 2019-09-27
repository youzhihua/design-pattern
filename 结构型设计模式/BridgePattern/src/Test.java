import decorate.Clothes;
import decorate.Earrings;
import decorate.Jacket;
import decorate.Shoes;
import entity.Men;
import entity.Person;
import entity.Women;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        //初始化服饰
        Clothes earrings = new Earrings();
        Clothes jacket = new Jacket();
        Clothes shoes = new Shoes();

        List<Clothes> list1 = new ArrayList<>();
        List<Clothes> list2 = new ArrayList<>();

        list1.add(shoes);
        list1.add(jacket);

        list2.add(shoes);
        list2.add(earrings);

        //男人
        Person men = new Men(list1);

        //女人
        Person women = new Women(list2);

        men.specialDes();
        men.showClothes();

        women.specialDes();
        women.showClothes();
    }
}
