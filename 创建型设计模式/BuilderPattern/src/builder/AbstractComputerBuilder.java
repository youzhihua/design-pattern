package builder;

import product.Computer;

/**
 * 抽象电脑建造者
 */
public abstract class AbstractComputerBuilder {

    protected Computer computer;

    //组装CPU
    public abstract void buildCpu();

    //组装主板
    public abstract void buildMainBoard();

    //组装显卡
    public abstract void buildGraphicsCard();

    //组装内存
    public abstract void buildMemory();

    //组装硬盘
    public abstract void buildHardDisk();

    //获取计算机
    public Computer getComputerItem(){
        return computer;
    }

}
