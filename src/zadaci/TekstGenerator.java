package zadaci;

import java.util.Random;

/**
 *
 * @author Zoran
 */
public class TekstGenerator {
    public static String generateRandomTest(long size) {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random(123);
        for (long i=0; i<size; i++) {
            int c = 64+rand.nextInt(30);
            sb.append((char)c); 
        }
        return sb.toString();
    }    
}
