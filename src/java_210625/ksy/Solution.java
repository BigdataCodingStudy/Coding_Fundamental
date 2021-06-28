package java_210625.ksy;

//음양 더하기
public class Solution {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		
		for(int i=0; i<signs.length; i++) {
			if(signs[i]) {
				answer += absolutes[i];
			}else {
					answer += absolutes[i]*-1;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		int absolutes[] = {4,7,12};
		boolean signs[] = {true, false, true};
		
		Solution solution = new Solution();
		System.out.println(solution.solution(absolutes, signs));
	}
}
