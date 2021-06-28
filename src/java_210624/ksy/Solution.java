package java_210624.ksy;

/* 평균 구하기 */
public class Solution {
	public double solution(int array[]) {
		double answer = 0;
		for(int i=0; i<array.length; i++) {
			answer += array[i];
		}
		return answer = answer/array.length;
	}
	
	public static void main(String[] args) {
		int array[] = {1,2,3,4};
		Solution solution = new Solution();
		System.out.println(solution.solution(array));
	}
}
