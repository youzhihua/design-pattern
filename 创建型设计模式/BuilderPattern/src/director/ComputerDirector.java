package director;

import builder.AbstractComputerBuilder;
import product.Computer;

/**
 * 电脑制造指挥者
 */
public class ComputerDirector {

    private AbstractComputerBuilder abstractComputerBuilder;

    public ComputerDirector(AbstractComputerBuilder abstractComputerBuilder){
        this.abstractComputerBuilder = abstractComputerBuilder;
    }

    public void buildComputer(){
        abstractComputerBuilder.buildCpu();
        abstractComputerBuilder.buildGraphicsCard();
        abstractComputerBuilder.buildMainBoard();
        abstractComputerBuilder.buildMemory();
        abstractComputerBuilder.buildHardDisk();
    }

    public Computer getComputer(){
        return abstractComputerBuilder.getComputerItem();
    }

}
