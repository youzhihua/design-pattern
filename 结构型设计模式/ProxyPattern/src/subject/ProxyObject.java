package subject;

/**
 * 代理对象
 */
public class ProxyObject implements Subject {

    private RealObject realObject;

    public ProxyObject(){
        realObject = new RealObject();
    }

    public void beforeOperation(){
        System.out.println("正在进行目标操作的前置处理");
    }

    @Override
    public void operation() {
        beforeOperation();
        realObject.operation();
        afterOperation();
    }

    public void afterOperation(){
        System.out.println("正在进行目标操作的后置处理");
    }
}
