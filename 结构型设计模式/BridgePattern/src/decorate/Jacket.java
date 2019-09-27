package decorate;

/**
 * 夹克服饰
 */
public class Jacket implements Clothes {
    @Override
    public void clothesDes() {
        System.out.println("这是一件酷酷的夹克衫");
    }

    @Override
    public void clothesEffect() {
        System.out.println("这件夹克增加了10点体力和10点魅力");
    }
}
