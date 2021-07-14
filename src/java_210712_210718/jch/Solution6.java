package java_210712_210718.jch;


public class Solution6 {
	public int solution(double num) {
        int count = 0;
        
    	while(num!=1) {
    		if(num%2==0) {
    			num/=2;
    		}else {
    			num = num*3 +1;
    		}
    		count++;
    		if(count>=500) {
    			count = -1;
    			break;
    		}
    	}
        return count;
    }
    
    
    public static void main(String[] args) {
    	Solution6 s = new Solution6();
    	int x = 626331;
    	System.out.println(s.solution(x));
    }
}
	
	
