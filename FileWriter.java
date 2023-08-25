import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class FileWriter{
    public String readFile (File file){
        FileReader fr = new FileReader (file);
        String s = "";
        while (fr.ready())
        {
            s += fr.read();
        }
        return s;
    }
    public void writeFile (String str, File file){
        Writer fw = new FileWriter (file);
        for (int i = 0; i < str.length(); i++)
        {
            fw.write(str.substring(i,i+1));
        }
    }
}