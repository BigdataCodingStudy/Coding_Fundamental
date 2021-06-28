package java_210624.kwy;
//
public class Solution {
	//정수합
	public int solution(int a, int b) {
		int answer = 0;
		
		if (a<b) {
			
		
		for (int i = a; i < b+1; i++) {
			answer+=i;
		}
		}else {
			for(int i = b; i<a+1; i++) {
				answer += i;
			}
		}
		

		
				return answer;
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
	
		Solution s = new Solution();
		System.out.println(s.solution(7, 5));
		
	
		
		
	}
	

}
