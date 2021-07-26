package java_210726_210801.ljh;

//3진법 뒤집기
/*
 * 자연수 n이 매개변수로 주어집니다. 
 * n을 3진법 상에서 앞뒤로 뒤집은 후, 
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class Solution2 {
    public int solution(int n) {
        int answer = 0;
        String ternary = "";        
        
        while(n!=0){    //이미 뒤집힌 채로 3진수 변환
            ternary += (n%3);
            n /= 3;
        }
        
        int square3 = 1;
        
        for(int i=0; i<ternary.length(); i++){  //3진수를 10진수로 변환
            answer += (ternary.charAt(ternary.length()-i-1)-'0') * square3; //char을 int로 변환하는 법을 몰랐음..
            square3 *= 3;
        }
        
        return answer;
    }
    
    
    public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] a = {1,2,3,4};
		int[] b = {-3, -1, 0, 2};
//		int[] arr = {3, 30, 34, 4, 40, 42, 421, 423, 45};
		int x = 5;
		int n = 45;

//		for(int i=0; i<n; i++) {
			System.out.println(s.solution(n));			
//		}
	}
}