package java_210623_start.jch;

public class Solution5 {

	public long solution(int a, int b) {
        long answer = 0;
        int i = Math.min(a, b);
        while(i<=Math.max(a, b)) {
        	answer +=i;
        	i++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int a = 3;
		int b = 5;
		System.out.println(s.solution(a,b));
	}
}

   
