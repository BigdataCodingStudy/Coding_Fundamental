package java_210726_210801.kyw;

import java.util.ArrayList;
import java.util.Arrays;

//체육복빌리기
public class Keypad {
	public int path_1(int[] numbers) {
		int path_1 = 0;
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8) {
				if (Math.abs(numbers[i] - numbers[i - 1]) == 0) {
					path_1 = 0;
				}
				if (Math.abs(numbers[i] - numbers[i - 1]) == 1 || Math.abs(numbers[i] - numbers[i - 1]) == 3) {
					path_1 = 1;
				}
				if (Math.abs(numbers[i] - numbers[i - 1]) == 2 || Math.abs(numbers[i] - numbers[i - 1]) == 4
						|| Math.abs(numbers[i] - numbers[i - 1]) == 6) {
					path_1 = 2;
				}
				if (Math.abs(numbers[i] - numbers[i - 1]) == 5 || Math.abs(numbers[i] - numbers[i - 1]) == 7) {
					path_1 = 3;
				}

			}
			if (numbers[i] == 0) {
				if ((numbers[i - 1]) == 0) {
					path_1 = 0;
				}
				if ((numbers[i - 1]) == 1 || (numbers[i - 1]) == 3) {
					path_1 = 4;
				}
				if ((numbers[i - 1]) == 2 || (numbers[i - 1]) == 4 || (numbers[i - 1]) == 6) {
					path_1 = 3;
				}
				if ((numbers[i - 1]) == 7 || (numbers[i - 1]) == 5 || (numbers[i - 1]) == 9) {
					path_1 = 2;
				}
				if ((numbers[i - 1]) == 8) {
					path_1 = 1;
				}
			}
			
		}
		return path_1;
	}

	public int path_2(int[] numbers) {
		int path_2 = 0;
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8) {
				if (Math.abs(numbers[i] - numbers[i - 2]) == 0) {
					path_2 = 0;
				}
				if (Math.abs(numbers[i] - numbers[i - 2]) == 1 || Math.abs(numbers[i] - numbers[i - 2]) == 3) {
					path_2 = 1;
				}
				if (Math.abs(numbers[i] - numbers[i - 2]) == 2 || Math.abs(numbers[i] - numbers[i - 2]) == 4
						|| Math.abs(numbers[i] - numbers[i - 2]) == 6) {
					path_2 = 2;
				}
				if (Math.abs(numbers[i] - numbers[i - 2]) == 5 || Math.abs(numbers[i] - numbers[i - 2]) == 7) {
					path_2 = 3;
				}
			}
			if (numbers[i] == 0) {
				if ((numbers[i - 2]) == 0) {
					path_2 = 0;
				}
				if ((numbers[i - 2]) == 1 || (numbers[i - 2]) == 3) {
					path_2 = 4;
				}
				if ((numbers[i - 2]) == 2 || (numbers[i - 2]) == 4 || (numbers[i - 2]) == 6) {
					path_2 = 3;
				}
				if ((numbers[i - 2]) == 7 || (numbers[i - 2]) == 5 || (numbers[i - 2]) == 9) {
					path_2 = 2;
				}
				if ((numbers[i - 2]) == 8) {
					path_2 = 1;
				}
			}
			
		}
		return path_2;
	}

	public static void main(String[] args) {
		Keypad s = new Keypad();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		String result = "";
		String real = "";
		String reverse = "";
		
		// 오른손잡이 왼손잡이 구분하기
		if (hand.equals("right")) {
			real = "R";
			reverse = "L";
		} else {
			real = "L";
			reverse = "R";
		}

		// 0, 1 일때 result값

		if (numbers[0] == 1 || numbers[0] == 4 || numbers[0] == 7) {
			result += "L";
		}
		if (numbers[0] == 3 || numbers[0] == 6 || numbers[0] == 9) {
			result += "R";
		}
		if (numbers[0] == 2 || numbers[0] == 5 || numbers[0] == 8 || numbers[0] == 0) {
			result += real;
		}

		if (numbers[1] == 1 || numbers[1] == 4 || numbers[1] == 7) {
			result += "L";
		}
		if (numbers[1] == 3 || numbers[1] == 6 || numbers[1] == 9) {
			result += "R";
		}

		if (numbers[1] == 2 || numbers[1] == 5) {
			result += result.substring(result.length() - 1, result.length());
		}
		if (numbers[1] == 8) {
			if (s.path_1(numbers) < 2) {
				result += result.substring(result.length() - 1, result.length());
			}
			if (s.path_1(numbers) < 2) {
				if (result.equals(real)) {
					result += reverse;
				} else {
					result += real;
				}
			}
			if (s.path_1(numbers) == 2) {
				result += real;
			}
		}
		if (numbers[1] == 0) {
			if (numbers[0] == 8) {
				result += real;
			} else {
				if (result.equals(real)) {
					result += reverse;
				} else {
					result += real;
				}
			}

		}
	

		// (i=2) result값정하기
		for (int i = 2; i < numbers.length; i++) {
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				result += "L";
			}
			else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				result += "R";
			}
			else  {
				if (s.path_1(numbers)< s.path_2(numbers)) {
					result += result.substring(result.length() - 1, result.length());
				}
				else if (s.path_1(numbers) >s.path_2(numbers)) {
					result += result.substring(result.length() - 2, result.length() - 1);
				}
				else if (s.path_1(numbers) == s.path_2(numbers)) {
					result += real;
				}
			}
			//1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5
			System.out.println(result);
			System.out.println(s.path_1(numbers));
			System.out.println(s.path_2(numbers));
		}
	

	}
}
