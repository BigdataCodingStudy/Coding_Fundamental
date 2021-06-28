package java_210624.jch;


public class Solution {
	boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        int count = 0;

        for (int i =0; i<s.length(); i++) {
        	if(s.charAt(i)=='P') count++;
        	else if (s.charAt(i)=='Y') count--;
        }
        
        if (count == 0) {
        	answer = true;
        }else {
        	answer = false;
        }

        return answer;
    }
	
	//java 8버전부터 가능
	boolean solution2(String s) {
        s = s.toUpperCase();
       
        
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	}
	
	
	
	
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String a = "pPpyYy";
		System.out.println(sol.solution(a));
		System.out.println(sol.solution2(a));
	}
	
}


