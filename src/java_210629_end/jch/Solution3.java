package java_210629_end.jch;

import java.util.Arrays;

public class Solution3 {
	public int[] solution(long n) {
        int[] answer = new int[(int)(Math.log10(n)+1)];
        
        while(n>0) {
        	
        	int length = (int)(Math.log10(n)+1);
        	answer[length-1]= (int) (n%10);
        	n/= 10;
        	
        }
        
        

        return answer;
    }
	
	
	
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		long n = 12345;
		System.out.println(Arrays.toString(s.solution(n)));
		
		
	}
}
