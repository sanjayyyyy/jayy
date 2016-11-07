/*Count words 
 * created by SanjayKumar On 7/11/16
 * */
import java.io.*;
public class Count_words {
	
	
	
	
   public static void main(String[] args) throws Exception {
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   String Line=br.readLine();
	   int count=0;
	   
	   for(int i=0;i<Line.length()-1;i++){
		   if(((Line.charAt(i)==' ')||(i==0))&&(Line.charAt(i+1)!=' '))
			   count++;
			   
		   
		   
	   }
	   System.out.println(count);

		   }
		   
	   }
	   
	   
	   
	 
	 
	  

		
			

