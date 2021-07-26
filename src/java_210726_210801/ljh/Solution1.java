package java_210726_210801.ljh;
//내적
/*
 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. 
 * a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
 * 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
 */
public class Solution1 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++){
            answer+=a[i]*b[i];
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] a = {1,2,3,4};
		int[] b = {-3, -1, 0, 2};
//		int[] arr = {3, 30, 34, 4, 40, 42, 421, 423, 45};
		int x = 5;
		int n = 24;

//		for(int i=0; i<n; i++) {
			System.out.println(s.solution(a, b));			
//		}
	}
}