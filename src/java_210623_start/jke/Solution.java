package java_210623_start.jke;



class Solution {
	  public String solution(int num) {
	      String answer = "";
	      if(num % 2 == 0){ 
	          answer = "Even";
	      }else{ 
	          answer = "Odd";
	      }
	      return answer;
	  	  }
public static void main(String args[]) {
	
	Solution s = new Solution();
	System.out.println(s.solution(3));

}
	  } 
