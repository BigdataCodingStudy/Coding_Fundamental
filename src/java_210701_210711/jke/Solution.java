package java_210701_210711.jke;

//문자열 내 p와 y의 개수 구하기

public class Solution {
	boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for(int i=0; i<s.length();i++) {
        	if(s.charAt(i)=='p'||s.charAt(i)=='P') {
        		p++;
        	}
        	if(s.charAt(i)=='y'||s.charAt(i)=='Y') {
        		y++;
        	}
        }
        
        if(y==p) {
        	answer = true;
        }else {
        	answer = false;
        }
        return answer;
    
	
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		String s1 = "pPoooyY";
		String s2 = "Pyy";
		
		System.out.println(s.solution(s1));
		System.out.println(s.solution(s2));
	}
}

