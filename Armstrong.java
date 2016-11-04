/*Armstrong number
 * created by SanjayKumar On 4/11/16
 * */
import java.util.*;
public class Armstrong {
	
	
   public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
int num=Sc.nextInt(),tempNum=num,newNum=0;
while(tempNum>0){
	 int a=tempNum%10;
	 newNum+=a*a*a;
	 tempNum/=10;
	 }
if(num==newNum)
	System.out.println(num);
else System.out.println("not an armstrong number");
	
		}
		
			
}


