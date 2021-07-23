package java_210719_210725.ljh;

public class Solution3 {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution3 s = new Solution3();
//		int[] arr = {3, 30, 34, 5, 9};
//		int[] arr = {0, 0, 0, 0, 0};
		String[] arr = {"Jane", "Kim"};
		int x = 2;
		int n = 5;
//		for(int i=0; i<arr.length-1; i++) {
			System.out.println(s.solution(arr));			
//		}
	}
}