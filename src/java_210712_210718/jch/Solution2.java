package java_210712_210718.jch;

public class Solution2 {
	public int solution(int n) {
        String answer = "";
        int answer3 = 0;
        
        while(n>0) {
        	answer = answer + (n%3);
        	n /= 3;
        }
        long answer2 = Long.parseLong(answer);
        
        int i = 0;
        while(answer2>0) {
        	answer3 += answer2%10*(Math.pow(3, i));
        	answer2 /=10;
        	i++;
        }
        return answer3;
    }
	
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int a = 45;
		int b = 78413450;
		System.out.println(s.solution(a));
		System.out.println(s.solution(b));
	}
}
