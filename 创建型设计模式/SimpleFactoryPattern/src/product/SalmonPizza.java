package product;

/**
 * 三文鱼披萨
 */
public class SalmonPizza extends Pizza {

    public SalmonPizza() {
        this.name = "三文鱼披萨";
        this.size = "12寸";
    }

    @Override
    public void description() {
        System.out.println("HI ! 我是： "+ name +" 我的尺寸是："+ size);
    }
}
