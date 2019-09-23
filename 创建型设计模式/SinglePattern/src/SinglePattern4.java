/**
 * 饿汉式变种
 */
public class SinglePattern4 {

    private static SinglePattern4 singlePattern4;

    static {
        singlePattern4 = new SinglePattern4();
    }

    private SinglePattern4(){}

    public static SinglePattern4 getInstance(){
        return singlePattern4;
    }
}
