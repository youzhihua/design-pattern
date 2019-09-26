package entity;

import decorate.Clothes;

import java.util.List;

public class Women extends Person {

    public Women(List<Clothes> decorateClothes) {
        super(decorateClothes);
    }

    @Override
    public void specialDes() {
        System.out.println("这是一个柔弱的女性角色，自带100点魅力，50点体力");
    }
}
