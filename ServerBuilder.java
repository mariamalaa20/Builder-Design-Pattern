public class ServerBuilder implements ComputerBuilder {
    private Computer computer;

    // Constructor
    public ServerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("AMD EPYC 7742");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("256GB ECC");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("4TB NVMe SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Ekran kartı yok");  // No graphics card
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}