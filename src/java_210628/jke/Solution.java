package java_210628.jke;

//두 정수 사이의 합

public class Solution {
	public long solution(int a, int b) {
        long answer = 0;
        if(a<b) {
        	for(int i = a; i<=b; i++) {
        		answer += i;
        	}
        }
        return answer;
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		Solution s = new Solution();
		System.out.println(s.solution(a, b));
	}

}