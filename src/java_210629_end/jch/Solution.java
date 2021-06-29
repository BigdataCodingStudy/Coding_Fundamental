package java_210629_end.jch;

public class Solution {
	public int solution(int n) {
        int answer = 0;

        while(n>0) {
        	answer += n%10;
        	n/= 10;
        }

        return answer;
    }
	
	
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int n = 123;
		int n2 = 987;
		System.out.println(s.solution(n));
		System.out.println(s.solution(n2));
	}
}
