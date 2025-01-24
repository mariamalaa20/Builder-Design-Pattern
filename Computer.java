public class Computer{
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;

    void setCPU(String CPU){
        this.CPU=CPU;
    }
    void setRAM(String RAM){
        this.RAM=RAM;
    }
    void setStorage(String storage){
        this.storage=storage;
    }
    void setGraphicsCard(String graphicsCard){
        this.graphicsCard=graphicsCard;
    }
    @Override
    public String toString() {
        return "Bilgisayar [CPU=" + CPU + ", RAM=" + RAM + ", Depolama=" + storage + ", Ekran Kartı=" + graphicsCard + "]";

    }
}