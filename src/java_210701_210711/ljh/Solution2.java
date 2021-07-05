package java_210701_210711.ljh;
//문자열 다루기 기본
/*
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
 * solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 
 * "1234"라면 True를 리턴하면 됩니다.
 */
public class Solution2 {
    public boolean solution(String s) {
        boolean answer = true;
        
        char tmp;
        if(s.length()==4 || s.length()==6){
           for(int i=0; i<s.length(); i++){
                tmp = s.charAt(i);
                if(!('0'<=tmp && tmp<='9')){
                    answer = false;
                }
            } 
        }
        else
            answer = false;
        
        return answer;
    }
}
