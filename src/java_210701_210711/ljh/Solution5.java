package java_210701_210711.ljh;
//수박수박수박수박수박수?
/*
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 
 * 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 
 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 */
public class Solution5 {
    public String solution(int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        if(n%2==0){
            for(int i=0; i<n/2; i++){
                sb.append("수");
                sb.append("박");
            }
        }
        else{
            
            sb.append("수");
            
            for(int i=0; i<n/2; i++){
                sb.append("박수");
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}