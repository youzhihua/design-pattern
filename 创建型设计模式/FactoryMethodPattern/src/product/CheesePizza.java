package product;

/**
 * 芝士披萨
 */
public class CheesePizza extends Pizza {

    public CheesePizza() {
        this.name = "芝士披萨";
        this.size = "9寸";
    }

    @Override
    public void description() {
        System.out.println("HI ! 我是： "+ name +" 我的尺寸是："+ size);
    }
}
