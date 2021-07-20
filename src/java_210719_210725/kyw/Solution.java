package java_210719_210725.kyw;

import java.util.ArrayList;

//크레인 인형뽑기

public class Solution {
	public static void main(String[] args) {

		int[][] board = { {0,0,0,0,0}, { 0,0,1,0,3 }, { 0,2,5,0,1}, {4,2,4,4,2},
				{3,5,1,3,1 } };
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		ArrayList<Integer> sub = new ArrayList<Integer>();
		int n = board.length;
		int[][] new_board = new int[n][n];

		// 크레인 행렬 만들기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				new_board[j][i] = board[i][j];
			}
		}

		// moves 순서대로 new_board의 인덱스 출력하기+출력하고 0으로 바꾸기
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < n; j++) {
				if (new_board[moves[i] - 1][j] != 0) {
					sub.add(new_board[moves[i] - 1][j]);
					new_board[moves[i] - 1][j] = 0;
					break;
				}
			}
		}
		
		
		for (int j = 0; j < sub.size(); j++) {

			for (int i = 0; i < sub.size() - 1; i++) {
				if (sub.size()!=0&& sub.get(i) == sub.get(i + 1)) {
					answer += 2;
					sub.remove(i);
					sub.remove(i);
				}
			}
		}
		
		if (sub.size() == 2 && (sub.get(0) == sub.get(1))) {
			answer += 2;
		}

		System.out.println(answer);

	}

}
