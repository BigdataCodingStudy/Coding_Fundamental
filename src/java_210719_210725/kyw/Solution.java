package java_210719_210725.kyw;

import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		
	
	String answer = "123_.def";
	ArrayList<String> sub = new ArrayList<String>();
	if(answer.charAt(answer.length()-1)=='.') {
		answer += "0";
	}
	
	if (answer.length() != 1) {
		for (int i = 0; i < answer.length()-1 ; i++) {
			if (!(answer.charAt(i) == '.' && answer.charAt(i + 1) == '.')) {
				sub.add(answer.substring(i, i + 1));
			}
		}
		System.out.println(answer);
		System.out.println(sub);
		answer = "";
		for (int i = 0; i < sub.size(); i++) {
			answer += sub.get(i);
		}
	}
System.out.println(answer);
	
}
	
}
