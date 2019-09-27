package entity;

import decorate.Clothes;

import java.util.List;

/**
 * 游戏人物抽象类
 */
public abstract class Person {
    List<Clothes> decorateClothes;

    public Person(List<Clothes> decorateClothes){
        this.decorateClothes = decorateClothes;
    }

    //人物特性
    public abstract void specialDes();

    //装饰描述
    public void showClothes(){
        for (int i = 0; i < decorateClothes.size(); i++) {
            decorateClothes.get(i).clothesDes();
            decorateClothes.get(i).clothesEffect();
        }
    }
}
