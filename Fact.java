/*Factorial number
 * created by SanjayKumar On 4/11/16
 * */
import java.util.*;
public class Fact {
	static int Fact(int num){
		if(num==1)
			return 1;
		else
			return (num*Fact(num-1));
		
		
	}
	
	
   public static void main(String[] args) {
	   System.out.println(Fact(new Scanner(System.in).nextInt()));
	 
}


	
		}
		
			



