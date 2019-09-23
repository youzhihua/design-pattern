import builder.AbstractComputerBuilder;
import builder.AsusComputerBuilder;
import builder.DellComputerBuilder;
import director.ComputerDirector;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        //华硕电脑制造者
        AbstractComputerBuilder asusComputerBuilder = new AsusComputerBuilder();
        //华硕电脑制造指挥者
        ComputerDirector asusComputerDirector = new ComputerDirector(asusComputerBuilder);
        //组装华硕电脑
        asusComputerDirector.buildComputer();

        System.out.println(asusComputerBuilder.getComputerItem());
        //戴尔电脑制造者
        AbstractComputerBuilder dellComputerBuilder = new DellComputerBuilder();
        //戴尔电脑制造指挥者
        ComputerDirector dellComputerDirector = new ComputerDirector(dellComputerBuilder);
        //组装戴尔电脑
        dellComputerDirector.buildComputer();

        System.out.println(dellComputerBuilder.getComputerItem());

    }

}
