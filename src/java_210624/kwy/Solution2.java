package java_210624.kwy;
//약수의 합//
public class Solution2 {

	
	
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i < n+1; i++) {
			if(n%i==0) {
				answer += i;
				
			}
		
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
	Solution2 s = new Solution2();
	System.out.println(s.solution(12));
	
		
	}
}
