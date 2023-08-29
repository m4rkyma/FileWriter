import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriters{
    public static String readFile (String fileName) throws IOException{
        FileReader fr = new FileReader (fileName);
        StringBuilder s = new StringBuilder ();
        while (fr.ready())
        {
            s.append((char)fr.read());
        }
        fr.close();
        return s.toString();
    }
    public static void writeFile (String str, String fileName) throws IOException{
        FileWriter fw = new FileWriter (fileName);
        fw.write(str);
        fw.close();
    }
    public static void main(String[] args) throws IOException {
        System.out.println(readFile ("file.txt"));
        writeFile ("poop", "file.txt");
    }
}