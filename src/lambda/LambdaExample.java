package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaExample {
    
    public static void main(String[] args) {
        
        List<String> list = Arrays.asList(new String[]{"Java", "SQL", "WebLogic", "ADF"});
        list.forEach(s -> System.out.println(s) ); // basic lambda expression
        list.forEach(System.out::println); // method reference ::        
        
    }
    
}
