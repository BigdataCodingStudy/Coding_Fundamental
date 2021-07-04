package java_210701_210706.kyw;
// 자연수 뒤집어 배열

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
	public int[] solution(long n) {
        int[] answer = {};

		String b = String.valueOf(n);
		ArrayList list = new ArrayList();
		
		for (int i = b.length(); i >0; i--) {
			list.add(b.substring(i-1,i));
		}
		
		answer = new int[list.size()];

		
		//int 변수 = Integer.parsInt(String.valueof("변환 값"));
		for (int i = 0; i < list.size(); i++) {
			
			answer[i] =  Integer.parseInt(String.valueOf(list.get(i)));
		}
		
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution(9876)));
		
		
	}

}