package java_210624.jch;


public class Solution2 {
	public boolean solution(String s) {
        boolean answer = true;
        
        if((s.length()==4)|(s.length()==6)) {
        	for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                	answer = false;
                }
            }
        }else {
        	answer = false;
        }
        return answer;
    }
	
	// 다른 사람 풀이 try/catch이용
	public boolean solution2(String s) {
	      if(s.length() == 4 || s.length() == 6){
	          try{
	              int x = Integer.parseInt(s);
	              return true;
	          } catch(NumberFormatException e){
	              return false;
	          }
	      }
	      else return false;
	  }
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String a = "1234";
		String b = "ajdf23";
		String c = "12345";
		String d = "123456";
		
		System.out.println(s.solution(a));
		System.out.println(s.solution(b));
		System.out.println(s.solution(c));
		System.out.println(s.solution(d));
		System.out.println(s.solution2(b));
	}
	
}
