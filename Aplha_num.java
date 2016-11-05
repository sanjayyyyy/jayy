/*Alphanumrecial count 
 * created by SanjayKumar On 5/11/16
 * */
import java.util.*;
public class Alpha_num {
	
	
	
	
   public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	String S=Sc.next();
	int charCount=0,numCount=0;
	for(int i=0;i<S.length();i++){
		if(Character.isAlphabetic(S.charAt(i)))
			System.out.println(charCount+++1);
		else System.out.println(numCount+++1);
		
	}
	
	   
	   
	 
	 
	  
	 
}


	
		}
		
			



