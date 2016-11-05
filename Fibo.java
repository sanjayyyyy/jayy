/*Fibonacci series
 * created by SanjayKumar On 5/11/16
 * */
import java.util.*;
public class Fibo {
	static int num1=1,num2=1,num3=0;
	static int fibonacci(int n){
		
		if(n>0){
			num3=num1+num2;
			System.out.println(num1+"+"+num2+"="+num3);
			num1=num2;
			num2=num3;
			
			
		
			
			
			 fibonacci(n-1);
		}
		
		return 0;
	}
	
	
	
   public static void main(String[] args) {
	   int num1=0,num2=1;
	   int fibo=new Scanner(System.in).nextInt();
	   System.out.println(num1+"+"+num2+"="+(num1+num2));
	   fibonacci(fibo-2);
	   
	 
	  
	 
}


	
		}
		
			



