/**
 * 双重校验锁，线程安全，JDK1.5之后可用
 */
public class SinglePattern7 {

    private static volatile SinglePattern7 singlePattern7;

    private SinglePattern7(){}

    public static SinglePattern7 getInstance(){
        if(singlePattern7 == null){
            synchronized (SinglePattern7.class){
                if(singlePattern7 == null){
                    singlePattern7 = new SinglePattern7();
                }
            }
        }
        return singlePattern7;
    }

}
