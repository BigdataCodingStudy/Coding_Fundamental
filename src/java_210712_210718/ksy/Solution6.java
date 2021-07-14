package java_210712_210718.ksy;

import java.util.Scanner;

// x만큼 간격이 있는 n개의 숫자
public class Solution6 {
	
	public long[] solution(int x, int n) {
         long[] answer = new long[n];
         
         //i -- long타입 (프로그래머스 조건)
         for(long i=0; i<n; i++){
        	 answer[(int)i] = x*(i+1);
        	 System.out.print(answer[(int)i]+" ");
         }
         
         /*
         answer[0]=x;
         System.out.print(answer[0]+" ");
         for(int i=1; i<answer.length; i++) {
        	 answer[i] = answer[i-1]+x;
        	 System.out.print(answer[i]+" ");
         }
          */
         
         
         return answer;
         
	}
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x : ");
		int x = sc.nextInt();
		System.out.println("n : ");
		int n = sc.nextInt();
		
		Solution6 s = new Solution6();
		s.solution(x, n);
		
	}
}
