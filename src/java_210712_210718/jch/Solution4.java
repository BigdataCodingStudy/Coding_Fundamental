package java_210712_210718.jch;


public class Solution4 {
	public boolean solution(int x) {
        boolean answer = true;
        
        int a = 0;
        int x1 = x;
        
        while(x>0) {
        	a += x%10;
        	x = x/10;
        }

        if(x1%a != 0) {
        	answer = false;
        }
        
        return answer;
    }
    
    
    public static void main(String[] args) {
    	Solution4 s = new Solution4();
    	int x = 18;
    	int y = 11;
    	System.out.println(s.solution(x));
    	System.out.println(s.solution(y));
    }
}
	
	

