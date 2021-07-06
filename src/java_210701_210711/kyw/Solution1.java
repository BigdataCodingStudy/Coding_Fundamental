package java_210701_210711.kyw;

import java.util.ArrayList;

//소수만들기
public class Solution1 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 7, 6, 4 };
		ArrayList list = new ArrayList();
		int[] answer = {};
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				for (int j2 = 0; j2 < j; j2++) {
				
					if (!list.contains(a[i] + a[j] + a[j2])) {
						list.add(a[i] + a[j] + a[j2]);						
					}
				}
			}
		}

		System.out.println(list);
		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) list.get(i);

		}

	/*	int x = 7;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {

				count += 1;
			}
		}*/
		System.out.println(count);
		
		
	}

}
