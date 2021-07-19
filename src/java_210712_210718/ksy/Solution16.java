package java_210712_210718.ksy;

import java.util.Scanner;

// 콜라츠 추측
public class Solution16 {
	public int solution(int num) {
        int answer = 0;
        int count = 0;
        if(count<=500 || num==1) {
            if(num%2==0) {
            	num = num/2;
            	count++;
            }else {
            	num = num*3+1;
            	count++;
            }
            if(num == 1) answer=1;
        }else {
        	answer = -1;
        }
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		Solution16 s = new Solution16();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int n = sc.nextInt();
		s.solution(n);
	}
}
