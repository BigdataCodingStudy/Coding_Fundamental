package java_210629_end.kyw;

import java.util.Arrays;

//최대공약수와 최소공배수
public class Solution {

	public int[] solution(int m, int n) {
		int[] answer = new int[2];
		for (int i = 1; i < Math.max(m, n); i++) {
			if (m % i == 0 && n % i == 0) {
				answer[0] = i;
			}
		}
		answer[1] = (m / answer[0] * n);
		return answer;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(6, 8)));
	}
}
