/*HCF series
 * created by SanjayKumar On 5/11/16
 * */
import java.util.*;
public class Hcf {
	
	
	
	
   public static void main(String[] args) {
	   Scanner Sc=new Scanner(System.in);
	   int num1=Sc.nextInt(),num2=Sc.nextInt();
	   int num3=num1*num2;
	   for(int i=num3;i>=1;i--){
		   if(num1%i==0&&num2%i==0){
			   System.out.println(i);
			   break;
		   }
		   
	   }
	   
	   
	   
	 
	 
	  
	 
}


	
		}
		
			



