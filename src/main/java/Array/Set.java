package Array;

import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
		java.util.Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		System.out.println(nums); // [1, 2, 3, 4, 5]
		
		nums.add(1);
		System.out.println(nums); // [1, 2, 3, 4, 5]
	}
}
