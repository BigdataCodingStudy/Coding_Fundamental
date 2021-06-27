package java_210627.ksy;

import java.util.Scanner;

//약수의 합
public class Solution {
	
    public int solution(int n) {
    	int answer = 0;
    	
    	for(int i=1; i<=n/2; i++) {
    		if(n%i==0) answer += i;
    	}
    	
    	/*
        for(int i=1; i<=n; i++) {
        	if(n%i==0)	answer += i;
        }
        */
        return answer+n;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("숫자를 입력하세요 : ");
    	int num = sc.nextInt(); 

    	Solution solution = new Solution();
    	
    	System.out.println(num +" 약수의 합 : "+solution.solution(num));
    }
}
