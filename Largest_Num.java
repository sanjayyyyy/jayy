package alpha;
import java.util.Scanner;
/*To find largest among three nums
 * created by sanjayKumar on 01-08-16
 */
public class Largest_Num{

	public static void main(String[] args)  {
		for(;;){
			Scanner Sc=new Scanner(System.in);
			int Num_1=Sc.nextInt(),Num_2=Sc.nextInt(),Num_3=Sc.nextInt();
			if((Num_1>Num_2)&&(Num_1>Num_3))
				System.out.println("largest num is "+" "+Num_1);
			else if((Num_2>Num_1)&&(Num_2>Num_3))
				System.out.println("largest num is "+" "+Num_2);
			else 	System.out.println("largest num is "+" "+Num_3);
			
	
				
		}
		

	}

	

	

}
