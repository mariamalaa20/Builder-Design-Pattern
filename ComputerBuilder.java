public interface ComputerBuilder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    void buildGraphicsCard();
    Computer getComputer();
}