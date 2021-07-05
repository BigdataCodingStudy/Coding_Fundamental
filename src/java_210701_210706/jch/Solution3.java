package java_210701_210706.jch;

import java.util.Arrays;

public class Solution3 {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++) {
			answer[i] = x*(i+1);
		}
        return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int x = 3;
		int n = 3;
		int x2 = 0;
		int n2 = 3;
		int x3 = -2;
		int n3 = 5;
		
		System.out.println(Arrays.toString(s.solution(x, n)));
		System.out.println(Arrays.toString(s.solution(x2, n2)));
		System.out.println(Arrays.toString(s.solution(x3, n3)));
		
	}
	
}
