package subject;

/**
 * 被代理对象
 */
public class RealObject implements Subject {
    @Override
    public void operation() {
        System.out.println("正在进行目标操作");
    }
}
