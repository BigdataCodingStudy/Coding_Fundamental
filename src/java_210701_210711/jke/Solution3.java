package java_210701_210711.jke;

//문자열을 정수로 바꾸기
public class Solution3 {
	public int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);
		return answer;
	}
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		
		String s1 = "1234";
		String s2 = "-1234";
		
		System.out.println(s.solution(s1));
		System.out.println(s.solution(s2));
	}

}

