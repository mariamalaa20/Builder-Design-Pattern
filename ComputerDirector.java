public class ComputerDirector {
    private ComputerBuilder builder;

    // Constructor
    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    // Method to construct the computer using the builder
    public void constructComputer() {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
        builder.buildGraphicsCard();
    }

    // Get the constructed computer
    public Computer getComputer() {
        return builder.getComputer();
    }
}