import java.io.File;
import java.io.FileReader;
public class Checkedexception {
    public static void main(String[] args) throws Exception
    {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }
}
