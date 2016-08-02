package alpha;

import java.util.Scanner;

/*To Find num is palindrome or not
 * created by sanjayKumar on 02-08-16
 */
public class Palindrome{
	

	public static void main(String[] args) { 
		for(;;){
			Scanner Sc=new Scanner(System.in);
			int a=Sc.nextInt();
			int b,Pal=0,c;
			c=a;
			while(a>0){
				b=a%10;
				Pal=(Pal*10)+b;
				a=a/10;
				
				
			}
			if(c==Pal)
				System.out.println(a+" "+"Is palindrome");
			else 	System.out.println(c+" "+"Not a  palindrome");

			}
		}}

