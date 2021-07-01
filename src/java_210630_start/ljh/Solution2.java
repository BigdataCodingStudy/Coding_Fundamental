package java_210630_start.ljh;
//실패율
/*
 * 실패율은 다음과 같이 정의한다.
스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
 */

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        //stages는 뒤죽박죽 현재 스테이지 번호
        //2차원 배열 [스테이지][실패율]
        double[][] rate = new double[N][2];

        //도달한 수 파악 : dodal
        //도달했으나 통과못한 수 파악 : fail
        double dodal;
        double fail;

        for(int i=0; i<N; i++) {
            rate[i][0] = i+1;
        }

        for(int i=1; i<N+1; i++) {
            dodal = 0;
            fail = 0;
            for(int j=0; j<stages.length; j++) {
                ////해당 스테이지보다 크거나 같으면 도달 => dodal
                if(i<=stages[j]) {
                    dodal++;
                }
                ////해당 스테이지와 같기만 하면 => fail
                if(i==stages[j]) {
                    fail++;
                }
            }
            //만약 달성한 자가 없으면 0이 나뉘는 것을 방지
            if(fail == 0) {  
                rate[i -1][1] = 0; 
                continue;
            }
            
            //실패율(double) : fail / dodal
            rate[i-1][1] = fail / dodal;
        }

        //실패율 기준으로 2차원 배열 내림차순
        Arrays.sort(rate, new Comparator<double[]>(){
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[1],o1[1]);
            }
        });
        
        //실패율이 같으면 걔네들끼리는 그냥 스테이지 기준으로 오름차순.`
        for (int i = 0; i < rate.length; i++) {
            answer[i] = (int)rate[i][0]; // 1.0 -> 1
        }

        return answer;
    }
	
	//테스트용 메인함수
		public static void main(String[] args) {
			Solution2 s = new Solution2();
			int[] str = {2,1,2,6,2,4,3,3};
			int N = 5;
			
			for(int i=0; i<N; i++) {			
				System.out.println(s.solution(N,str)[i]);
			}
		}
}
