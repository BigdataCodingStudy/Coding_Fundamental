package java_210701_210706.ksy;

// 가운데 글자 가져오기
public class Solution {
	public String solution(String s) {
		
		int len = s.length();
		return s.substring((len-1)/2, len/2+1);
		
		/*
        String answer = "";
        int len = s.length();
        if(len%2==0) {
    		answer = s.substring(len/2-1, len/2+1);
    	}else {
    		answer = Character.toString(s.charAt(len/2));
    	}
        System.out.println(answer);
        return answer;
        */
    }
	
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("abcd"));
		
//		s.solution("abcd");
	}
}
