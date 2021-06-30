package java_210630_start.ksy;

// 문자열을 정수로 바꾸기
public class Solution {
	public int solution(String s) {
		int answer = Integer.parseInt(s);
		if(s.length()>0 && s.length()<6) {
			System.out.println(answer);			
		}else {
			System.out.println("제한 조건을 확인하세유~");
		}
        return answer;
    }
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution("323234");
	}
}
