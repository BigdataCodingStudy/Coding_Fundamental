package java_210712_210718.ksy;

import java.util.Scanner;

// 하샤드 수
public class Solution14 {
	public boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int a = x;
		
		while(a>=1) {
			sum += a%10;
			a /= 10;
		}
		
		if(x%sum==0) {
			answer = true;
		}else {
			answer = false;
		}
		System.out.println(answer);
		
		return answer;
		
		
		/*
		String[] temp = String.valueOf(num).split("");

	    int sum = 0;
	    for (String s : temp) {
	        sum += Integer.parseInt(s);
	    }
	
	    if (num % sum == 0) {
          return true;
	    }else {
	      return false;
	    }
		
		*/
		
		/*
		 * 조건에 안맞음(프로그래머스)
		boolean answer = true;
		
		int a = x/10;
		int b = x%10;
		int sum = a+b;
		
		if(x%sum==0) {
			answer = true;
		}else {
			answer = false;
		}
		
		return answer;
		*/
	}

	public static void main(String[] args) {
		Solution14 s = new Solution14();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		s.solution(x);
		
	}
}
