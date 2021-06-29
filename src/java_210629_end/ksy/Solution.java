package java_210629_end.ksy;

public class Solution {
	 public boolean solution(String s) {
		 
		 boolean answer=true;
		 
		 if (s.length() == 4 || s.length() == 6) answer= s.matches("(^[0-9]*$)");
		 System.out.println(answer);
		 answer = false;
		 return answer;
		 
		 
		 /*
		 boolean answer=true;
		 
		 if(s.length()==4 || s.length()==6) {
			 try {
				 int x = Integer.parseInt(s);
				 answer= true;
			 }catch(NumberFormatException e){
				 answer= false;
			 }
		 }else
			 answer=false;
		 
		 System.out.println(answer);
		 return answer;
		 */
		 
		 
		 
		 /*
	        boolean answer = true;
	        
	        if(s.length()==4 || s.length()==6) {
	        	for(int i=0; i<s.length(); i++) {
	        		if(s.charAt(i)<'0' || s.charAt(i)>'9') {
	        			answer = false;
	        		}
	        	}
	        }else {
	        	answer = false;
	        }
	        System.out.println(answer);
	        return answer;
	     */
	    }
	 
	 public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution("2334");
	}
}
