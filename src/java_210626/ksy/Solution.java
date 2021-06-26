package java_210626.ksy;

import java.util.Scanner;

// 두 정수 사이의 합
public class Solution {
	public long solution(int a, int b) {
		return answer(Math.min(a, b), Math.max(a, b));

		/*
		if(a<b){
            for(int i=a; i<=b; i++){
                answer += i;
            }
        }else{
            for(int i=b; i<=a; i++){
                answer += i;
            }
        }
		*/
		
		
		/*
		for(int i=((a<b)? a:b); i<=((a<b)? b:a); i++)
			answer += i;
		
		return answer;
		*/
	}
	
	
	
	private long answer(long a, long b) {
		return (b-a+1) * (a+b) /2;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a :");
		int a = sc.nextInt();
		System.out.println("b :");
		int b = sc.nextInt();
		Solution solution = new Solution();
		
		System.out.println(solution.solution(a, b));
		
	}
}
