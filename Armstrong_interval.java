/*Armstrong number
 * created by SanjayKumar On 4/11/16
 * */
import java.util.*;
public class Armstrong_interval {
	
	
   public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
int Num, tempNum,newNum,Start=Sc.nextInt(),end=Sc.nextInt();
for(int i=Start;i<=end;i++){
	tempNum=i;
	newNum=0;
	while(tempNum!=0){
	 int a=tempNum%10;
	 newNum+=a*a*a;
	 tempNum/=10;
	 }

if(i==newNum)
	System.out.println(i);
}


	
		}
		
			
}


