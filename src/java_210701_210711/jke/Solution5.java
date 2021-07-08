package java_210701_210711.jke;

//수박수박수박수
public class Solution5 {
	public String solution(int n) {
        String answer = "";
        for(int i=1;i<=n;i++) {
        	if(i%2==0) {
        		answer += "박";
        	}else {
        		answer += "수";
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		//ex) n=3 : 수박수,  n=4 : 수박수박, n=7 : 수박수박수박수
		int i1 = 3; 
		int i2 = 4; 
		int i3 = 7;
		
		System.out.println(s.solution(i1));
		System.out.println(s.solution(i2));
		System.out.println(s.solution(i3));
	}
}
