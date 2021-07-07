package java_210701_210711.kyw;
//2016
public class Solution_26 {
	 public String solution(int a, int b) {
	        String answer = "";
	        boolean isLeafYear = false;
	    	int totalcount=0;
	    	int year = 2016;

	    	int []monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	    	String []dayArray = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
	    	
	    	if((year%4==0&&year%100!=0)||year%400==0) {
	    		isLeafYear = true;
	    	}
	    	if(isLeafYear) {
	    		monthArray[1]=29;
	    	}
	    	totalcount+=year-1;
	    	for (int i = 0; i < a-1; i++) {
	    		totalcount+=monthArray[i];
	    	}
	    	totalcount+=b;
	    	
	    	
	    	for (int i = 0; i < dayArray.length; i++) {
	    		if(totalcount%7==i) {
	    			answer = dayArray[i];
	    		}
	    	}
	    	

	        return answer;
	    }
	
	
public static void main(String[] args) {
	int a = 5;
	int b = 24;
	Solution_26 s = new Solution_26();

	
	System.out.println(s.solution(a, b));
	
	
	
	
}
}
