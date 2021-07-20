package java_210719_210725.ksy;

import java.util.Scanner;

// 소수 찾기
public class Solution {
	
	public int solution(int n) {
		int answer = 0;
		
		// 에라토스테네스의 체
		int[] numbers = new int[n + 1];

		for (int i = 2; i <= n; i++) numbers[i] = i;
		
		for (int i = 2; i < n; i++) {
			if (numbers[i] == 0) continue;

			for (int j = 2 * i; j <= n; j += i)
				numbers[j] = 0;
		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != 0) answer++;
		}
		
		System.out.println(n+"까지 소수의 개수 : " +answer+"개");
        
          
        
        /*
        for(int i=2; i<=n; i++) {
        	boolean check = true;
        	for(int j=2; j<i; j++) {  //--- 프로그래머스 통과안됨 => for(int j=2; j*j<i; j++) {  
        		if(i%j==0) {
        			check = false;
        			break;
        		}
        	}
        	
        	if(check) answer++;
        }
        
        System.out.println(n+"까지 소수의 개수 : " +answer+"개");
        */
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int n = sc.nextInt();
		s.solution(n);
	}
}
