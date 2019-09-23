/**
 * 静态内部类，可以实现百分百的懒加载
 */
public class SinglePattern5{

    private SinglePattern5(){}

    private static class SinglePatternInner{
        private static final SinglePattern5 singlePattern5 = new SinglePattern5();
    }

    public static SinglePattern5 getInstance(){
        return SinglePatternInner.singlePattern5;
    }
}
