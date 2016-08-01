package alpha;




import java.util.Scanner;
/*To find Leap year or not
 * created by sanjayKumar on 01-08-16
 */
public class Leap_Year{

	public static void main(String[] args)  {
		for(;;){
			Scanner Sc=new Scanner(System.in);
			int Year=Sc.nextInt();
			if(Year%4==0)
				System.out.println(Year+" "+"is a leap year ");
			else System.out.println(Year+" "+"not a leap year");
			
	
				
		}
		

	}

	

	

}
