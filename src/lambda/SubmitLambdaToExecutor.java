/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Zoran
 */
public class SubmitLambdaToExecutor {
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList(new String[]{"Java", "SQL", "WebLogic", "ADF"});
        ExecutorService es = Executors.newSingleThreadExecutor();
        es.submit(() -> list.forEach(System.out::println));
    }
}
