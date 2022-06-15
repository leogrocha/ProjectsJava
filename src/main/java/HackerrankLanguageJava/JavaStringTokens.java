package HackerrankLanguageJava;

import java.util.ArrayList;

public class JavaStringTokens {
	public static void main(String[] args) {
		String s = "He is a very very good boy, isn't he?";
		ArrayList<String> strings = new ArrayList<>();
		String caracteres = "";
		
		for(int i = 1; i < s.length(); i++) {
			String caracter = s.substring(i-1, i);
			
			if((!caracter.equals(" ")) || (!caracter.equals("!")) || (!caracter.equals(","))
					|| (!caracter.equals("?")) || (!caracter.equals("."))
					|| (!caracter.equals("_")) || (!caracter.equals("'"))
					|| (!caracter.equals("@"))) {
				caracteres = caracteres + s.charAt(i);
			} else {
				strings.add(caracter);
				caracteres = "";
			}
			
		}
		
		System.out.println(strings.size());
		System.out.println(strings);
	}
}
