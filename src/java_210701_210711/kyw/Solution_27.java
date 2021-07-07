package java_210701_210711.kyw;
// 내적
public class Solution_27 {
	 public int solution(int[] a, int[] b) {
	        int answer = 0;
	        for (int i = 0; i < b.length; i++) {
				answer += a[i]*b[i];
			}
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		Solution_27 s = new Solution_27();
		int[]a= {1,2,3,4};
		int[]b= {-3,-1,0,2};
		
		System.out.println(s.solution(a, b));
	}


}
