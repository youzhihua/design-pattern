/**
 * 懒汉式,多线程安全
 */
public class SinglePattern2 {

    private static SinglePattern2 singlePattern2;

    private SinglePattern2(){}

    public static synchronized SinglePattern2 getInstance(){
        if(singlePattern2 == null)
            singlePattern2 = new SinglePattern2();
        return singlePattern2;
    }

}
