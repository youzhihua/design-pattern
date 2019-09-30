package factory;

import flyweight.ConcreteFlyweight1;
import flyweight.ConcreteFlyweight2;
import flyweight.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元对象工厂类
 */
public class FlyweightFactory {
    private static Map<String,Flyweight> flyweights;

    static {
        flyweights = new HashMap<>();
    }

    public static Flyweight getConcreteFlyweight(String name){
        switch (name){
            case "flyweight1":
                if(flyweights.containsKey("flyweight1")){
                    System.out.println("正在共享flyweight1对象");
                }else{
                    Flyweight flyweight = new ConcreteFlyweight1();
                    flyweights.put("flyweight1",flyweight);
                }
                break;
            case "flyweight2":
                if(flyweights.containsKey("flyweight2")){
                    System.out.println("正在共享flyweight1对象");
                }else{
                    Flyweight flyweight = new ConcreteFlyweight2();
                    flyweights.put("flyweight2",flyweight);
                }
                break;
            default:
                System.out.println("共享池参数有误");
                return null;
        }
        return flyweights.get(name);
    }
}
