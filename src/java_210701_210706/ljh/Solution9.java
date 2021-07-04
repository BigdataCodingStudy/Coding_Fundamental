package java_210701_210706.ljh;

//자연수 뒤집어 배열로 만들기
/*
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
 * 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */

import java.util.ArrayList;

public class Solution9 {
    public int[] solution(long n) {
        
        ArrayList<Long> list = new ArrayList<>();

        while(n>0){
            list.add(n%10);
            n/=10;
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = (list.get(i)).intValue();
        }
        
        return answer;
    }
}