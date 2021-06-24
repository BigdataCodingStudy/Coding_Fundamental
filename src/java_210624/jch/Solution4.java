package java_210624.jch;


public class Solution4 {
	public String solution(String s) {
        String answer = "";
        if(s.length()%2==0) {
        	int i = s.length()/2;
        	answer = s.substring(i-1,i+1);
        }else {
        	answer = s.substring(s.length()/2,s.length()/2+1);
        }
        
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		String a = "1234";
		String b = "12345";
		
		System.out.println(s.solution(a));
		System.out.println(s.solution(b));
		
	}
	
}


