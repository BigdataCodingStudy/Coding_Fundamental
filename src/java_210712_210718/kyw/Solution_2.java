package java_210712_210718.kyw;
//완주하지 못한 선수
import java.util.Arrays;
public class Solution_2 {
	public String solution(String[] participant, String[] completion) {
	       String answer = "";
	       Arrays.sort(participant);
	       Arrays.sort(completion);
	       for(int i=0; i<completion.length; i++){
	           if(!participant[i].equals(completion[i])) {
	               answer = participant[i];
	           }
	       }
	       		answer =  participant[participant.length-1];
		     
	           return answer;
	}
	public static void main(String[] args) {
		 String [] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
	      String [] completion = {"josipa", "filipa", "marina", "nikola"};
	      
	      String answer = "";
	      Solution_2 s = new Solution_2();
	      System.out.println(s.solution(participant, completion));

	}
}