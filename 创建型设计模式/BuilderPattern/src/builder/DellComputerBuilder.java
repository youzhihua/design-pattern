package builder;

import product.Computer;

/**
 * 戴尔电脑制造者
 */
public class DellComputerBuilder extends AbstractComputerBuilder{

    public DellComputerBuilder(){
        computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel 酷睿i5 9代");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("戴尔TUF B360M-PLUS GAMING S");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("七彩虹iGame GeForce RTX 2080 Ti Advanced OC 全新 NVIDIA Turing");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("金士顿骇客神条FURY 8GB DDR4 2400（HX424C15FB/8） 8GB/单条");
    }

    @Override
    public void buildHardDisk() {
        computer.setMemory("西部数据1TB 7200转 64MB SATA3 黑盘（WD1003FZEX）");
    }
}
