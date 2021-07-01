package java_210630_start.kyw;
//자릿수 더하기
public class Solution {
	
	public int solution(int n) {
		int answer = 0;
		while (n != 0) {
			answer += n % 10;
			n = n/10;
		}
		return answer;
	}
	
	
	
	
	public static void main(String[] args) {
	Solution s = new Solution();
	System.out.println(s.solution(12345));
	}
}
   /*
    * 
    * String num = String.valueOf(n);
 
        for(int i = 0 ; i < num.length() ; i ++){
            answer += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
    * 
    * 
    * 
    */