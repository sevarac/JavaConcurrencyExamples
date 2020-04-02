package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample {
      
    public static void main(String[] args) {
       List<String> list = Arrays.asList(new String[]{"Java", "SQL", "WebLogic", "ADF"});
       
       list.stream().forEach( s -> System.out.print(s + " ") );
       
        System.out.println();
        System.out.println("--------------------------------------");
       
        list.stream().map( s -> s.toUpperCase() )                        
                     .forEach( s -> System.out.print(s + " ") );
        
        System.out.println();
        System.out.println("--------------------------------------");

        list.stream().filter(s -> s.startsWith("J"))
                     .map( s -> s.toUpperCase() )                        
                     .forEach( s -> System.out.print(s + " ") );     

        System.out.println();
        System.out.println("--------------------------------------");        
        
        IntStream
        .range(1, 10)
        .forEach(i -> System.out.println(i));        
       
    }
    
}
