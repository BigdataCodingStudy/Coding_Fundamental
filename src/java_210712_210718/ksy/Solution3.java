package java_210712_210718.ksy;

//﻿자연수 뒤집어 배열로 만들기
public class Solution3 {
	public int[] solution(long n) {
		
		/*
		 * 프로그래머스에서 통과 못하는 코드
		 * 
		String s = Long.toString(n);
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++) {
        	answer[i] += (int)n%10;
        	n/=10;
        	System.out.print(answer[i]);
        }
        return answer;
        */
		
		
		String tempStr = new String(n+"");
	    char[] tempChar = tempStr.toCharArray();
	    int[] answer=new int[tempChar.length];
	    for(int i =0; i<tempChar.length; i++){
			answer[i] = Integer.parseInt(tempChar[tempChar.length-1-i]+"");
			System.out.print(answer[i]);
	    }
	    
	    return answer;
		
	    /*
		int length = Long.toString(n).length();
        int[] answer = new int[length];
        
        for (int i=0; i<length; i++) {
            answer[i] = (int)(n%10);
            n /= 10;
            System.out.print(answer[i]);
        }
        
        return answer;
		 */
    }
	
	public static void main(String[] args) {
		long n = 967822343;
		Solution3 s = new Solution3();
		s.solution(n);
	}
}
