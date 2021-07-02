package java_210701_210706.ksy;

import java.util.Scanner;
//수박수박수박수
public class Solution2 {
	public String solution(int n) {
		/*
		return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
		*/
		
		String answer="";
		for(int i=0; i<n; i++) {
			answer += i%2==0 ? "수" : "박";
			/*
			if(i%2==0) {
				answer += "수";
			}else {
				answer += "박";
			}
			*/
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		s.solution(sc.nextInt());
	}
}
