package java_210719_210725.ksy;

import java.util.Arrays;

// 체육복
public class Solution6 {

	public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        /*
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if(lost[i]==reserve[j]) { //여벌 - 도난
        			answer++;
        			reserve[i] = -3;
        			lost[j] = -3;
        			break;
        		}
        	}
        }
        
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<reserve.length; j++) {
        		if((lost[i]-1==reserve[j]) || (lost[i]+1==reserve[j])) { // 빌려줘
        			answer++;
        			reserve[j] = -3;
        			break;
        		}
        	}
        }
      */
        
        
        
        
      //잃어버린애가 두벌가져온애인지 확인(참 : -10 대입, reserve자격박탈)
        for(int i =0; i<reserve.length; i++){
            for(int j =0; j<lost.length; j++){
                //자격박탈된애들 빼주기
                if(lost[j]==-10 && reserve[i]==-10){
                    continue;
                }
                //reserve 자격 박탈
                if(lost[j]==reserve[i]){
                    lost[j]=-10;
                    reserve[i]=-10;
                    answer++;
                }
            }
        }
        
        for(int i =0; i<lost.length; i++){
            for(int j =0; j<reserve.length; j++){
                if(lost[i]==-10 || reserve[j]==-10){
                    continue;
                }
                //바로 
                if(Math.abs(lost[i]-reserve[j])==1){
                    answer++;
                    reserve[j]=-10;
                    break;
                }
            }
        }
        
        
        
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int n = 5;
		int[] lost = {2,4};
//		int[] reserve = {1,3,5};
		int[] reserve = {3};
		s.solution(n, lost, reserve);
		
	}
}
