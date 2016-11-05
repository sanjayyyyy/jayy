/*Lcm 
 * created by SanjayKumar On 5/11/16
 * */
import java.io.*;

public class Lcm {
	
	
	
	
   public static void main(String[] args) throws java.lang.Exception{
	BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));
	int num1=Integer.parseInt(Br.readLine()),num2=Integer.parseInt(Br.readLine());
	
	
	  
	   int max=num1>num2?num1:num2;
	   int min=num2<num1?num2:num1,lcm=0;
	   for(int i=1;i<=min;i++){
		   int x=max*i;
		   if(x%min==0){
			   
			  lcm=x; 
			  break;
			   
		   }
		 
		   
		   
	   }
	   System.out.println(lcm);
	 
	  
	 
}


	
		}
		
			



