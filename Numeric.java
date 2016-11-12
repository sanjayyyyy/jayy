/*Count numeric char 
 * created by SanjayKumar On 12/11/16
 * */
import java.io.*;
public class Numeric {
	
	
	
	
   public static void main(String[] args)throws Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String Line=br.readLine();
	int count=0;
	for(int i=0;i<Line.length();i++){
		if(Character.isDigit(Line.charAt(i)))
			count++;
			
		
		
	}
	System.out.println(count);
	
	  

		   }
		   
	   }
	   
	   
	   
	 
	 
	  

		
			

