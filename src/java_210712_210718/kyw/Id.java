package java_210712_210718.kyw;

import java.util.ArrayList;

//신규아이디 추천
public class Id {

	public String solution(String new_id) {
		String answer = "";
		// 1단계
		new_id = new_id.toLowerCase();
		String special = "";
		int stop = 0;
		ArrayList<String> sub = new ArrayList<String>();

		// 2단계

		for (int i = 0; i < new_id.length(); i++) {
			if (!Character.isLetterOrDigit(new_id.charAt(i))
					&& (new_id.charAt(i) == '.' || new_id.charAt(i) == '_' || new_id.charAt(i) == '-')) {
				special += new_id.charAt(i);
				answer += new_id.charAt(i);
			} else if (Character.isLetterOrDigit(new_id.charAt(i))) {
				answer += new_id.charAt(i);
			}
		}

		// 3단계

		if (answer.charAt(answer.length() - 1) == '.') {
			answer += "0";

			if (answer.length() != 1) {
				for (int i = 0; i < answer.length() - 1; i++) {
					if (!(answer.charAt(i) == '.' && answer.charAt(i + 1) == '.')) {
						sub.add(answer.substring(i, i + 1));
					}
				}
				answer = "";
				for (int i = 0; i < sub.size(); i++) {
					answer += sub.get(i);
				}
			}
		}

		// 4단계
		for (int i = 0; i < answer.length(); i++) {
			if (!answer.substring(i, i + 1).equals(".")) {
				stop += i;
				break;
			}
		}

		sub = new ArrayList<String>();
		for (int i = stop; i < answer.length(); i++) {
			sub.add(answer.substring(i, i + 1));
		}

		answer = "";
		for (int i = 0; i < sub.size(); i++) {
			answer += sub.get(i);
		}

		sub = new ArrayList<String>();
		if (answer.substring(answer.length() - 1).equals(".")) {
			for (int i = 0; i < answer.length() - 1; i++) {
				sub.add(answer.substring(i, i + 1));
			}
			answer = "";
			for (int i = 0; i < sub.size(); i++) {
				answer += sub.get(i);
			}
		}

		// 5단계
		if (answer.length() == 0) {
			answer += "a";
		}

		// 6단계
		sub = new ArrayList<String>();
		if (answer.length() > 15) {
			sub.add(answer.substring(0, 15));

			answer = "";
			for (int i = 0; i < sub.size(); i++) {
				answer += sub.get(i);
			}
		}

		// 7단계
		sub = new ArrayList<String>();

		for (int i = 0; i < answer.length(); i++) {
			sub.add(answer.substring(i, i + 1));
		}

		while (sub.size() < 3) {
			sub.add(answer.substring(answer.length() - 1, answer.length()));

		}

		answer = "";
		for (int i = 0; i < sub.size(); i++) {
			answer += sub.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		String answer = "";
		// 1단계
		new_id = new_id.toLowerCase();
		String special = "";
		int stop = 0;
		ArrayList<String> sub = new ArrayList<String>();

		// 2단계

		for (int i = 0; i < new_id.length(); i++) {
			if (!Character.isLetterOrDigit(new_id.charAt(i))
					&& (new_id.charAt(i) == '.' || new_id.charAt(i) == '_' || new_id.charAt(i) == '-')) {
				special += new_id.charAt(i);
				answer += new_id.charAt(i);
			} else if (Character.isLetterOrDigit(new_id.charAt(i))) {
				answer += new_id.charAt(i);
			}
		}

		// 3단계

		if (answer.charAt(answer.length() - 1) == '.') {
			answer += "0";
		}
		System.out.println(answer);
			if (answer.length() != 1) {
				for (int i = 0; i < answer.length() - 1; i++) {
					if (!(answer.charAt(i) == '.' && answer.charAt(i + 1) == '.')) {
						sub.add(answer.substring(i, i + 1));
					}
				}
				answer = "";
				for (int i = 0; i < sub.size(); i++) {
					answer += sub.get(i);
				}
			}
		
		
		
		
		System.out.println(answer);

		// 4단계
		for (int i = 0; i < answer.length(); i++) {
			if (!answer.substring(i, i + 1).equals(".")) {
				stop += i;
				break;
			}
		}

		sub = new ArrayList<String>();
		for (int i = stop; i < answer.length(); i++) {
			sub.add(answer.substring(i, i + 1));
		}

		answer = "";
		for (int i = 0; i < sub.size(); i++) {
			answer += sub.get(i);
		}

		sub = new ArrayList<String>();
		if (answer.substring(answer.length() - 1).equals(".")) {
			for (int i = 0; i < answer.length() - 1; i++) {
				sub.add(answer.substring(i, i + 1));
			}
			answer = "";
			for (int i = 0; i < sub.size(); i++) {
				answer += sub.get(i);
			}
		}

	

		// 5단계
		if (answer.length() == 0) {
			answer += "a";
		}

		// 6단계
		sub = new ArrayList<String>();
		if (answer.length() > 15) {
			sub.add(answer.substring(0, 15));

			answer = "";
			for (int i = 0; i < sub.size(); i++) {
				answer += sub.get(i);
			}
		}

		sub = new ArrayList<String>();
		if (answer.substring(answer.length() - 1).equals(".")) {
			for (int i = 0; i < answer.length() - 1; i++) {
				sub.add(answer.substring(i, i + 1));
			}
			answer = "";
			for (int i = 0; i < sub.size(); i++) {
				answer += sub.get(i);
			}
		}

		// 7단계
		sub = new ArrayList<String>();

		for (int i = 0; i < answer.length(); i++) {
			sub.add(answer.substring(i, i + 1));
		}

		while (sub.size() < 3) {
			sub.add(answer.substring(answer.length() - 1, answer.length()));

		}

		answer = "";
		for (int i = 0; i < sub.size(); i++) {
			answer += sub.get(i);
		}

		System.out.println(answer);

	}
}
