public class Main{
public static void main (String args[]){
// Gaming bilgisayarı oluştur
ComputerBuilder gamingBuilder = new GamingComputerBuilder();
ComputerDirector gamingDirector = new ComputerDirector(gamingBuilder);
gamingDirector.constructComputer();
Computer gamingPC = gamingDirector.getComputer();
System.out.println("Oyun Bilgisayarı: " + gamingPC);

// Ofis bilgisayarı oluştur
ComputerBuilder officeBuilder = new OfficeComputerBuilder();
ComputerDirector officeDirector = new ComputerDirector(officeBuilder);
officeDirector.constructComputer();
Computer officePC = officeDirector.getComputer();
System.out.println("Ofis bilgisayarı: " + officePC);

// Sunucu bilgisayarı oluştur
ComputerBuilder serverBuilder = new ServerBuilder();
ComputerDirector serverDirector = new ComputerDirector(serverBuilder);
serverDirector.constructComputer();
Computer serverPC = serverDirector.getComputer();
System.out.println("Sunucu: " + serverPC);
}
}