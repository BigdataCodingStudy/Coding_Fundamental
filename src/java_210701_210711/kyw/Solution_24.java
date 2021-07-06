package java_210701_210711.kyw;
//서울에서 김서방 찾기 
public class Solution_24 {
	 public String solution(String[] seoul) {
	        String answer = "";
	        
	        int x = 0;
	    	for (int i = 0; i < seoul.length; i++) {
	    		if(seoul[i].equals("Kim")) {
	    			x = i;
	    			break;
	    		}
	    	}
	        
	        answer = "김서방은 " +x+ "에 있다";
	        return answer;
	    }
	
	
	/*
	 * int x = Arrays.asList(seoul).indexOf("Kim");
*/
	
public static void main(String[] args) {
	String []seoul = {"kwon","Kim"};
	Solution_24 s = new Solution_24();
	System.out.println(s.solution(seoul));
	
	
}
}
