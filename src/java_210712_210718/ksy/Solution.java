package java_210712_210718.ksy;

import java.util.Scanner;

// ﻿자릿수 더하기
public class Solution {
	
	public int solution(int n) {
        int answer = 0;
        
        
        /*
        String s = String.valueOf(n);
        
        for(int i=0; i<s.length(); i++) {
        	answer += Integer.parseInt(s.substring(i, i+1));
        }
         */
        
        int len = (int)Math.log10(n)+1;
        for(int i = 0; i < len; i++) {
            answer += n%10;
            n = n/10;   
        }
        
        
        /*
        while(n>0) {
        	answer += n%10;
        	n/=10;
        }
        */
        
        
        System.out.println(answer);
        return answer;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :D");
		int n = sc.nextInt();
		Solution s = new Solution();
		s.solution(n);
	}
	
}
