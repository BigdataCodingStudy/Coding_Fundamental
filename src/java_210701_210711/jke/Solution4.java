package java_210701_210711.jke;

//가운데 글자 가져오기, substring
public class Solution4 {
	public String solution(String s) {
        String answer = "";
        if(s.length()%2==0) {
        	answer = s.substring(s.length()/2-1, s.length()/2+1);
        }else {
        	answer = s.substring(s.length()/2, s.length()/2+1);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Solution4 s = new Solution4();
		String s1 = "abcde";
		String s2 = "qwer";
		
		System.out.println(s.solution(s1));
		System.out.println(s.solution(s2));
	}
}