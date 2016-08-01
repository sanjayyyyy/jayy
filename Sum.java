package alpha;

import java.util.Scanner;

/*To Find Sum of N
 * created by sanjayKumar on 01-08-16
 */
public class Sum{
	

	public static void main(String[] args) { 
		for(;;){
Scanner Sc=new Scanner(System.in);
	int num=1,a,b=0;
	a=Sc.nextInt();
	for(;num<=a;num++){
		b+=num;
		
	}
	System.out.println("sum of natural num is"+" "+b);
			}
		}}

