package java_210623_start.jch;

public class Solution6 {

	public int solution(int n) {
        int answer = 0;
        for(int i =1; i<=n/2; i++) {
        	if(n%i==0) {
        		answer += i;
        	}
        }
        
        return answer + n;
    }
	
	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int a = 12;
		System.out.println(s.solution(a));
	}
}

  
 