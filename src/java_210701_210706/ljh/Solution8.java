package java_210701_210706.ljh;

import java.util.ArrayList;
import java.util.Arrays;

//나누어 떨어지는 숫자 배열
/*
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 
 * 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */

public class Solution8 {
    public int[] solution(int[] arr, int divisor) {
        
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){    //나누어 떨어지면 리스트에 저장
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        
        if(list.size()<1){  //나누어 떨어지는 element가 없다면 -1
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){   //배열에 옮기기
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);    //오름차순 정렬
        
        return answer;
    }
}
