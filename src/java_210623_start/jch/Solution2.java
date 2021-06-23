package java_210623_start.jch;

public class Solution2 {
	
	public int solution(int[] a, int[] b) {
        int answer = 0;  
        
        int i = 0;
        while(i<a.length) {
        	answer += a[i]*b[i];
        	i++;
        }
        return answer;
    
	}
	
	


	public static void main(String[] args) {
		Solution2 ip = new Solution2();
		int[] c = { 1, 2, 3, 4 };
		int[] d = { 1, 2, 3, 4 };
		  
		System.out.println(ip.solution(c, d));
	}
}
