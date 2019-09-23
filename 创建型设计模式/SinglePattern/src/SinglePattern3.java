/**
 * 饿汉式
 */
public class SinglePattern3 {

    private static SinglePattern3 singlePattern3 = new SinglePattern3();

    private SinglePattern3(){}

    public static SinglePattern3 getInstance() {
        return singlePattern3;
    }
}
