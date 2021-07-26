package java_210726_210801.ljh;

//핸드폰 번호 가리기
/*
 * 프로그래머스 모바일은 개인정보 보호를 위해 
 * 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 
 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 
 * *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 */

public class Solution5 {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        //뒷 4자리 *처리
        for(int i=0; i<phone_number.length()-4; i++){
            sb.append("*");
        }
        //뒷 4자리 빼고 정상 입력
        for(int i=phone_number.length()-4; i<phone_number.length(); i++){
            sb.append(phone_number.charAt(i));
        }
        
        answer = sb.toString();
        
        return answer;
    }
    
    
    public static void main(String[] args) {
		Solution5 s = new Solution5();
		int[] a = {1,2,3,4};
		int[] b = {-3, -1, 0, 2};
		int[] arr = {1,1,3,3,0,1,1};
		int x = 5;
		int n = 10;
		String phone_number = "01033334444";

//		for(int i=0; i<s.solution(arr).length; i++) {
			System.out.println(s.solution(phone_number));			
//		}
	}
}