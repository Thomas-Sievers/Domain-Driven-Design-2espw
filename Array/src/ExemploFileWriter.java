import java.io.FileWriter;
import java.io.IOException;

public class ExemploFileWriter {
    static void main(String[] args) {
        try (FileWriter writer = new FileWriter("example.txt")){
            writer.write("Hello, world!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
