package Exercises;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(1,2,1,3,2);
        int d = 3;
        int count = 0;
        
        int sum = 1;
        
        sum += s.get(0+1);
        if(sum == d) {
        	count++;
        }
        
        System.out.println(count);
        
    }
}
