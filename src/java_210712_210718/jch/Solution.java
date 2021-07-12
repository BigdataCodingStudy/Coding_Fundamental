package java_210712_210718.jch;

public class Solution {
	public String solution(int a, int b) {
        String answer = "";
        //2016년 1월 1일은 금요일
        int year = 2016;
        
        int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        boolean isLeafYear = year%4==0 && year%100!=0 || year%400==0;

        if(isLeafYear) {
        	monthArray[1] =29;
        }
        
        String []dayArray = {"THU", "FRI", "SAT", "SUN","MON","TUE","WED"};
        
        int totalCount = 0;
        for(int i =0 ; i<a-1 ; i++) {
        	totalCount += monthArray[i];
        }
        totalCount += b;
        
        for(int i =0; i<dayArray.length; i++) {
        	if(totalCount%7==i) {
        		answer = dayArray[i];
        	}
        	
        }
       
        return answer;
    }
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int a = 1;
		int b= 2;
		System.out.println(s.solution(a, b));
	}
}
