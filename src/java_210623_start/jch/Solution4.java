package java_210623_start.jch;

public class Solution4 {

	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i =0; i<absolutes.length; i++) {
        	answer += absolutes[i]*(signs[i]? 1:-1);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] a = {4, 7, 12};
		boolean[] b = {true,false,true};
		
		System.out.println(s.solution(a,b));
	}
}

  
