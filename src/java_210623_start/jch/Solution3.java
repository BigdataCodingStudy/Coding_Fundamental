package java_210623_start.jch;

public class Solution3 {

	public double solution(int[] arr) {
        double answer = 0;
        for(int i=0; i<arr.length; i++) {
        	answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }
	
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] a = { 1, 2, 3, 4};
		int[] b = {5, 5};
		
		System.out.println(s.solution(a));
		System.out.println(s.solution(b));
	}
}

  
