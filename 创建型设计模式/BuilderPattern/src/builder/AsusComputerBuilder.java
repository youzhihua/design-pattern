package builder;

import product.Computer;

/**
 * 华硕电脑建造者
 */
public class AsusComputerBuilder extends AbstractComputerBuilder{

    public AsusComputerBuilder(){
        computer = new Computer();
    }

    @Override
    public void buildCpu() {
        computer.setCpu("Intel 酷睿i7 9代");
    }

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("华硕TUF B360M-PLUS GAMING S");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("七彩虹iGame GeForce RTX 2060 Ti Advanced OC 全新 NVIDIA Turing");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("金士顿骇客神条FURY 8GB DDR4 2400（HX424C15FB/8） 16GB/单条");
    }

    @Override
    public void buildHardDisk() {
        computer.setMemory("西部数据1TB 7200转 64MB SATA3 黑盘（WD1003FZEX）");
    }
}
