import java.util.*;
public class Power_num {

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	int num=Sc.nextInt(),pow=Sc.nextInt();
	if(pow==0||pow==1){
	
		System.out.println(num);
		}
		else if(num==pow){
			num=1;
				
				for(int j=0;j<pow;j++){
					num=num*pow;
					
				}
				System.out.println(num);
					
					
		}
			else{
				int temp=1;
				for(int i=0;i<pow;i++){
					
				temp*=num;
				
				
			}
				System.out.println(temp);
				}
			
			
		}
		
			


	}


