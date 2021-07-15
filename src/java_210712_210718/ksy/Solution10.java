package java_210712_210718.ksy;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

//2016년 
public class Solution10 {

	public String solution(int a, int b) {
		
		Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, a-1, b).build();
		String answer = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
		System.out.println(answer);
        return answer;
		
        /*
		String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int sum = 0;
		
        for(int i=1; i<a; i++) {
			sum+=month[i-1];
		}
		
        int date = sum+b;
		
        switch(date%7) {
	        case 0: answer = week[0]; break;
        	case 1: answer = week[1]; break;
        	case 2: answer = week[2]; break;
        	case 3: answer = week[3]; break;
        	case 4: answer = week[4]; break;
        	case 5: answer = week[5]; break;
        	case 6: answer = week[6]; break;
        	default: System.out.println("잘못된 입력"); break;
        }
        System.out.printf("2016년 %d월 %d일 %s.",a,b,answer);
        return answer;
        */
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월 =>" );
		int a = sc.nextInt();
		System.out.println("일 =>" );
		int b = sc.nextInt();
		Solution10 s = new Solution10();
		s.solution(a, b);
	}
}
