package java_210628.ksy;

//문자열 내 p와 y의 개수
public class Solution {
    boolean solution(String s) {
        
    	boolean answer = true;
        
        /*
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;      
        */

    	
        int size = s.length(), pCount = 0, yCount = 0;
        for(int i=0; i<size; i++){
            switch(String.valueOf(s.charAt(i)).toUpperCase()){
                case "P": pCount++; break;
                case "Y": yCount++; break;
                default: break;
            }
        }
        if(pCount==0 && yCount==0) return true;
        return (pCount==yCount)? true : false;
        

       
        
        /*
        return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;
        */
        
        
        
        /*
        int pCount = 0;
        int yCount = 0;
        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i)=='p' || s.charAt(i)=='P') {
        		pCount ++;
        	}
        	if(s.charAt(i)=='y' || s.charAt(i)=='Y') {
        		yCount ++;
        	}
        }
        
        if(pCount==yCount) {
        	answer = true;
        	System.out.println(answer);
        }else {
        	answer = false;
        	System.out.println(answer);
        }
        return answer;
        */
        
        
        
        /*
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
        */
        
    }
	
	public static void main(String[] args) {
		
		Solution solution = new Solution();
		solution.solution("pPpyY");
		
	}
}
