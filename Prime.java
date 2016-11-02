import java.util.*;
public class Prime {
	static boolean primeNum(int num){
		int a=num,i=2,temp=0;
		while(i<=a){
			temp=a%i;
			
			if(temp==0&&i==a&&a%2!=0)
				return true;
		
			i++;
			
			
		}
		
		return false;
	}
	
   public static void main(String[] args) {
	   int prime=new Scanner(System.in).nextInt();
	   if(primeNum(prime)==true)
	   System.out.println(prime+" "+ " prime numbr");
	   else System.out.println(prime+" "+ " not prime numbr");
	   

	
	
			
			
		}
		
			


	}


