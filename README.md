
# ✨ Computer Factory Pattern Implementation

A simple Java implementation of the Factory Design Pattern to create different types of computers dynamically.

## 🌟 Features
- Uses an **abstract class** to define a computer blueprint.
- Implements **Factory Design Pattern** for object creation.
- Supports **PC** and **Server** classes with specific configurations.
- Encapsulates object instantiation in the `ServerFactory` and `PCFactory` classes.

## ⚙️ Requirements
- Java 8 or later
- IDE (e.g., IntelliJ IDEA, Eclipse, VS Code)

## 🛠️ Installation
```bash
# Clone the repository
git clone https://github.com/yourusername/your-repo.git
cd your-repo

# Compile the Java files
javac *.java
```

## 📚 Project Structure
```
.
├── Computer.java      # Abstract class for Computer
├── Factory.java       # Abstract class for Factory pattern
├── PC.java            # Concrete class for PC
├── Server.java        # Concrete class for Server
├── PCFactory.java     # Factory class for PC objects
├── ServerFactory.java # Factory class for Server objects
├── Main.java          # Main class to test the implementation
```

## ⚡ Usage
```java
public class Main {
    public static void main(String[] args) {
        Factory fabrika1 = new ServerFactory("4GB", "13. Nesil");
        Computer sunucu = fabrika1.createComputer();
        System.out.println(sunucu.getRam() + " " + sunucu.getCpu());
    }
}
```

## 💡 Future Enhancements
- Add a `Laptop` class to extend functionality.
- Implement a `ComputerFactory` for generalized object creation.
- Introduce unit tests for validation.




