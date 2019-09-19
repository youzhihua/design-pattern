package product;

/**
 * 三文鱼蛋糕
 */
public class SalmonCake extends Cake{

    public SalmonCake() {
        this.name = "三文鱼蛋糕";
        this.size = "9寸";
    }

    @Override
    public void description() {
        System.out.println("HI ! 我是： "+ name +" 我的尺寸是："+ size);
    }
}
