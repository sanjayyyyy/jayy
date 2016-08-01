package alpha;

import java.util.Scanner;

/*To Count no of digits of  int
 * created by sanjayKumar on 01-08-16
 */
public class Count{
	

	public static void main(String[] args) { 
		for(;;){
Scanner Sc=new Scanner(System.in);
int num=Sc.nextInt();
int Count=0;
while(num>=Count){
	num=num/10;
	if(num==1)
		Count++;
Count++;
}
System.out.println("No of Count is"+" "+Count);
			}
		}}

