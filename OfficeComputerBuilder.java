public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;

    // Constructor
    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Intel i5");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("16GB");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("512GB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Bütünleşik ekran kartı");  // Integrated graphics
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}