package HackerrankAlgorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class MigratoryBirds {
	
	public static List<Integer> migratoryBirds(List<Integer> arr) {
		List<Integer> nums =  new ArrayList<>();
		List<Integer> numsArray = new ArrayList<>();
		int count = 0;
		int bigger = 0;
		int smallerType = 0;
	
		// Verificando os valores iguais dentro do array
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < arr.size(); j++) {
				if(arr.get(i) == arr.get(j)) {
					count++;
				}
				
			}
			numsArray.add(count);
			count = 0;
		}
		
		
		return nums;
	}
	
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,4,4,4,5,3);
		
		System.out.println(migratoryBirds(arr));
	}
}
