package HackerrankLanguageJava;

public class JavaStringsIntroduction {
	public static void main(String[] args) {
		String A = "hello";
		String B = "java";
		
		int sum_caracteres = A.length() + B.length();
		System.out.println(sum_caracteres);
		
		int char_a = A.charAt(0);
		int char_b = B.charAt(0);
//		System.out.println(char_a); //104
//		System.out.println(char_b); // 106
		
		if(char_a > char_b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		 
		
		
		
		
		
		
		
	}
}
