package java_210719_210725.ljh;

import java.util.ArrayList;

public class Solution2 {
    public int[] solution(int[] arr) {
        
        int min = arr[0];
        ArrayList<Integer> list = new ArrayList<>();
                
        for(int i=0; i<arr.length; i++){    //배열을 리스트로 변환(삭제하기 위해)
            list.add(arr[i]);
        }
        
        for(int i=1; i<list.size(); i++){   //최소값 구하기
            if(min>list.get(i)){
                min = list.get(i);   
            }               
        }
        if(list.size()==1){                 //배열 크기가 1이면 -1반환
            list.set(0,-1);
        }
        else{
            list.remove((Integer)min);      //그게 아니면 최소값 제거
        }
        

        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }

    public static void main(String[] args) {
		Solution2 s = new Solution2();
//		int[] arr = {3, 30, 34, 5, 9};
//		int[] arr = {0, 0, 0, 0, 0};
		int[] arr = {4,3,2,1};
		int x = 2;
		int n = 5;
		for(int i=0; i<arr.length-1; i++) {
			System.out.println(s.solution(arr)[i]);			
		}
	}
}
