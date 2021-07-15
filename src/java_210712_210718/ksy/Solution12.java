package java_210712_210718.ksy;

import java.util.ArrayList;
import java.util.Scanner;

//3진법 뒤집기
public class Solution12 {
	public int solution(int n) {
		
		int answer = 0;
		String a = "";

		while (n > 0) {
			a = (n % 3) + a;
			n /= 3;
		}
		
		a = new StringBuilder(a).reverse().toString();
		answer = Integer.parseInt(a, 3); 
		System.out.println(answer);
		
		return answer;
		
		
		/*
		int answer = 0;
		ArrayList<Integer> na = new ArrayList<Integer>(); // 나머지

		// 10 -> 3(반전)
		while (true) {
			if (n < 3) {
				na.add(n);
				break;
			}
			na.add(n % 3);
			n = n / 3;
		}
		System.out.println(na);

		// 3->10
		for (int i = 0; i < na.size(); i++) {
			answer += (Math.pow(3, na.size() - i - 1) * na.get(i));
		}

		System.out.print("3진법 뒤집기==> " + answer);
		return answer;
		*/
		
	}

	public static void main(String[] args) {
		Solution12 s = new Solution12();
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수 숫자==> ");
		int n = sc.nextInt();
		s.solution(n);
	}
}
