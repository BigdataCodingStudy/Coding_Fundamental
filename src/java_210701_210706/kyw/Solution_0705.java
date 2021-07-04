package java_210701_210706.kyw;
//정수 제곱근 판별
public class Solution_0705 {
	

	    public long solution(long n) {
	        long answer = 0;
	        
	        if((int)Math.sqrt(n)==Math.sqrt(n)) {
				answer = (long)(Math.pow(Math.sqrt(n)+1, 2));
			}else {
				answer = (-1);
			}

	        return answer;
	    }
	
	
	
	
	
	public static void main(String[] args) {
		
		Solution_0705 s = new Solution_0705();
		System.out.println(s.solution(120));
		
		
		
		
	}

}
