package java_210630_start.ljh;
//문자열 내 마음대로 정렬하기
/*
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 
 * 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
 * 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면
 * 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 */
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        
        //n번째 인자값을 맨 앞으로 붙여서
        for (int i=0; i <strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        //정렬시킨다. 그럼 자연스럽게 n번째 인자값 중심으로 정렬하게 됨
        Collections.sort(list);
        
        //그리고 맨앞에 붙였던거 도로 떼면 되지요
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }             
        
        return answer;
    }
	
	//테스트용 메인함수
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] str = {"sun","bed","car"};
		for(int i=0; i<str.length; i++) {			
			System.out.println(s.solution(str,1)[i]);
		}
	}
} 
