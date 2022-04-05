package Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes2 {
	// URI 1478

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o numero de elementos da matriz:");
		int n = scan.nextInt();
		
		int[][] matriz = new int[n][n];

		while (n != 0) {
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.println(Arrays.deepToString(matriz));
				}
			}
			
			
			System.out.print("Informe o numero de elementos da matriz:");
			n = scan.nextInt();
		}
		
		scan.close();
	}
}
