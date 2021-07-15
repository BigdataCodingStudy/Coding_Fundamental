package java_210712_210718.ksy;

//내적
public class Solution11 {
	public int solution(int[] a, int[] b) {
		int answer = 0;
		for(int i=0; i<a.length; i++) {
			answer += a[i]*b[i];
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Solution11 s = new Solution11();
//		int[] a = {1,2,3,4};
//		int[] b = {-3,-1,0,2};

		int[] a = {-1,0,1};
		int[] b = {1,0,-1};
		s.solution(a, b);
	}
}
