package zadaci;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Zoran
 */
public class TekstGenerator {
    static String generateRandomText(long size) {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random(123);
        for (long i=0; i<size; i++) {
            int c = 64+rand.nextInt(30);
            sb.append((char)c); 
        }
        return sb.toString();
    }    
    
    static void writeToFile(String fileName, String text) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(fileName));
        pw.write(text);
        pw.close();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        String text = generateRandomText(1000000);
        writeToFile("Milion.txt", text);
        System.out.println(text);
    }
    
}
