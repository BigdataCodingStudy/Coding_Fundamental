package java_210701_210706.jch;

public class Solution {
	public long solution(long n) {
        long answer = 0;
        
        if(Math.sqrt(n)%1==0) {
        	answer = (long)(Math.pow((Math.sqrt(n)+1), 2));
        }else {
        	answer = -1;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		long n1 = 144;
		long n2 = 5;
		System.out.println(s.solution(n1));
		System.out.println(s.solution(n2));
	}
}
