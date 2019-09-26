package decorate;

public class Shoes implements Clothes {
    @Override
    public void clothesDes() {
        System.out.println("这是一双平淡无奇的鞋子");
    }

    @Override
    public void clothesEffect() {
        System.out.println("这双鞋子增加了5点移动速度和10点魅力");
    }
}
