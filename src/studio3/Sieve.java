package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Choose your n: ");
		int n = in.nextInt();
		boolean[] array = new boolean[n+1];
		
		
		for(int p = 2; p < array.length; p++) {
			array[p] = true;}
		
		for (int i = 2; i <= n; i++) {			
			for (int j = i*i; j <= n; j+=i) {
					array[j] = false;
						
					}
			
				}
				
			
				
			
		for (int c = 2; c < n; c++) {
			if(array[c] == true) {
				System.out.print(c + " ");
				}
			}

}
}
