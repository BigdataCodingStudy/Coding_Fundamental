package java_210623_start.kyw;

public class Solution {
	// 홀짝
	public String solution(int num) {
		String s="";
		if (num % 2 == 0) {
			s = "Even";
		} else {
			s="Odd";

		}
		return s;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("답= "+s.solution(9351));
	}
}
/*


a = []
def solution(a):
    b = 0
    for i in a:
        b+=i
    return b


a = [1,2,3,4,5,6]
solution(a)


*/