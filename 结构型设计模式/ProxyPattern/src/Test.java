import subject.ProxyObject;
import subject.Subject;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new ProxyObject();
        subject.operation();
    }
}
