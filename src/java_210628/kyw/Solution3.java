package java_210628.kyw;

//수박수박수박수
public class Solution3 {

	
	public String solution(int n) {
		String answer = "";
		String a = "수";
		String b = "박";
		
	
		if(n%2==0) {
			for (int i = 0; i < n/2; i++) {
			answer = answer.concat(a);
			answer = answer.concat(b);
			}
			
		}else {
			for(int i = 0; i<n/2; i++) {
				answer = answer.concat(a);
				answer = answer.concat(b);
			}
			answer = answer.concat(a);
		}
		
		return answer;
		}
	
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution(5));
		
	}

}
