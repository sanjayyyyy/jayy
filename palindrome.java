import java.util.*;
public class palindrome {
	static boolean palindrome(int num){
		int a=num,reverse=0;
		while(num!=0){
			int b =num%10;
			reverse=reverse*10+b;
			num=num/10;
			
			}
		if(reverse==a)
			return true;
		else
	return false;
		
		
	}
   public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	int palindrome=Sc.nextInt();
	if(palindrome(palindrome))
		System.out.println("palindrome");
	else System.out.println("not a palindrome");
	
	
			
			
		}
		
			


	}


