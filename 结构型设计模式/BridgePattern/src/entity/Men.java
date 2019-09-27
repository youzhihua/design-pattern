package entity;

import decorate.Clothes;

import java.util.List;

/**
 * 男性角色
 */
public class Men extends Person {

    public Men(List<Clothes> decorateClothes) {
        super(decorateClothes);
    }

    @Override
    public void specialDes() {
        System.out.println("这是一个强壮的男性角色，自带100点体力，50点魅力");
    }
}
