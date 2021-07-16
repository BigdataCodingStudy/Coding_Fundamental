package java_210712_210718.kyw;

//비밀지도
import java.util.ArrayList;

public class Screte_map {

	public ArrayList<String> binary(int[] arr, int n) {
		ArrayList<String> a = new ArrayList<String>();
		String a1 = "";

		for (int i = 0; i < arr.length; i++) {
			a1 = Integer.toBinaryString(arr[i]);
			while (a1.length() != n) {
				a1 = "0" + a1;
			}
			a.add(a1);
		}

		return a;
	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		ArrayList<String> sub = new ArrayList<String>();
		String x = "";

		a2 = binary(arr2, n);
		a1 = binary(arr1, n);
		for (int i = 0; i < n; i++) {
			x = "";
			for (int j = 0; j < n; j++) {
				if (a1.get(i).substring(j, j + 1).equals("0") && a2.get(i).substring(j, j + 1).equals("0")) {
					x += " ";
				} else {
					x += "#";
				}
			}
			sub.add(x);

		}
		answer = new String[sub.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = sub.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };

	}

}
