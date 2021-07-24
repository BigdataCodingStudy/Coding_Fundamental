package java_210719_210725.jch;

public class Solution {
	public static void main(String[] args) {
		int k = 1;
		
		for(int i=1; i<=10; i++) {
			while(k<=10-i) {
				System.out.print(" ");
				k++;
			}
			k = 1;
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
