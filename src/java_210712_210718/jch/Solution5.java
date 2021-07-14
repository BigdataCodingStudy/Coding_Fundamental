package java_210712_210718.jch;


public class Solution5 {
	 public String solution(String phone_number) {
	        String answer = "";
	        
	        for(int i=0; i<phone_number.length()-4; i++) {
	        	answer += "*";
	        }
	        
	        answer += phone_number.substring(phone_number.length() - 4);
	        return answer;
	    }
    
    
    public static void main(String[] args) {
    	Solution5 s = new Solution5();
    	String x = "01033331234";
    	System.out.println(s.solution(x));
    }
}
	
	
