package java_210628.kyw;

//문자열을 정수로 변환
public class Solution {

	public int Soultion(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);
		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.Soultion("-1234"));
	}

}
