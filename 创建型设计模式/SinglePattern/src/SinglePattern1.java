/**
 *  懒汉式，线程不安全
 */
public class SinglePattern1 {
    private static SinglePattern1 singlePattern1;
    private SinglePattern1(){}
    public static SinglePattern1 getInstance(){
        if(singlePattern1 == null)
            singlePattern1 = new SinglePattern1();
        return singlePattern1;
    }
}
