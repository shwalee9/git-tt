package progr;

public class y161 {

	public static void main(String[] args) {
		y161 y1 = new y161();
		
		System.out.println(y1.solution(3, 4));
		
	}
	
	
	
	public String solution(int a, int b) {
	      String answer = "";
	      
	      
	      
	      int m[]= {31,29,31,30,31,30};
	      
	      int sum = 0;
	      
	      for (int i = 0; i < (a-1); i++) {
			sum += m[i];
		}
	      
	      sum = sum + b;
	      System.out.println(sum);
	      
	      if(sum%7 ==1) {
	    	  answer = "FRI";
	      }
	      else if(sum%7 ==2) {
	    	  answer ="SAT";
	      }
	      else if(sum%7 ==3) {
	    	  answer ="SUN";
	      }
	      else if(sum%7 ==4) {
	    	  answer ="MON";
	      }
	      else if(sum%7 ==5) {
	    	  answer ="TUE";
	      }
	      else if(sum%7 ==6) {
	    	  answer ="WED";
	      }
	      else if(sum%7 ==0) {
	    	  answer ="THU";
	      }
	      
	      
	      
	      
	      return answer;
	  }
}
