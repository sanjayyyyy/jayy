/*Count char 
 * created by SanjayKumar On 6/11/16
 * */
import java.io.*;
public class Count_char {
	
	
	
	
   public static void main(String[] args) throws Exception {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   String Line=br.readLine();
	   int count=0;
	   for(int i=0;i<Line.length();i++){
		   if(Character.isAlphabetic(Line.charAt(i)))
			   count++;
			   
		   
		   
	   }
	   System.out.println(count);
		   }
		   
	   }
	   
	   
	   
	 
	 
	  

		
			

