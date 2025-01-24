public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;
    // Constructor
    public GamingComputerBuilder() {
        this.computer = new Computer();
    }
    @Override
    public void buildCPU() {
        computer.setCPU("Intel i9");
    }
    @Override
    public void buildRAM() {
        computer.setRAM("32GB");
    }
    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }
    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("NVIDIA RTX 4090");
    }
    @Override
    public Computer getComputer() {
        return computer;
    }
}