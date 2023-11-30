package Task_4_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader1 {
    public static void main(String[] args) {
        File file = new File("doc.txt");
        try {
            FileReader fr = new FileReader(file);
            int content;
            while ((content = fr.read()) != -1){
                System.out.println(content);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
