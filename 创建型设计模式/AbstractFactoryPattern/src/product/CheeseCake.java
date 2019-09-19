package product;

/**
 * 芝士蛋糕
 */
public class CheeseCake extends Cake {

    public CheeseCake() {
        this.name = "芝士蛋糕";
        this.size = "12寸";
    }

    @Override
    public void description() {
        System.out.println("HI ! 我是： "+ name +" 我的尺寸是："+ size);
    }
}
