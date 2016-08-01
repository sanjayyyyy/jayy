package alpha;

import java.util.Scanner;

/*To Find Power Of a Numb
 * created by sanjayKumar on 01-08-16
 */
public class Power{
	

	public static void main(String[] args) { 
		for(;;){
			Scanner Sc=new Scanner(System.in);
			int a=Sc.nextInt();
			int Count=0,Mul=1;
			while(Count<a){
				Mul*=a*1;
				Count++;
				
			}
			System.out.println("Power of"+" "+a+" "+"is"+" "+Mul);
				

			}
		}}

