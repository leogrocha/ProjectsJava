package HackerrankAlgorithms;

import java.util.Arrays;
import java.util.List;



public class SubArrayDivision {
	// Ainda n�o est� 100% resolvido
	public static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		int sum = 0;
		
		for(int i = 0; i < s.size(); i++) {
			if(s.size() - i < m)
				break;
			
			sum = s.get(i);
			
			for(int j = 0; j < m-1; j++) {
				sum += s.get(j+1);
			}
			
			if(sum == d) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(1,2,1,3,2);
		
		int d = 3;
		int m = 2;
		
		System.out.println(birthday(s, d, m));
		
	}
}
