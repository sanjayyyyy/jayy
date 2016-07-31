package alpha;

import java.io.BufferedInputStream;

import java.io.IOException;




public class Alpha_notAlpha {

	public static void main(String[] args)throws IOException  {
		for(;;){
			BufferedInputStream Scan=new BufferedInputStream(System.in);
	
		char a=(char) Scan.read();

if(Character.isLetter(a))
			System.out.println(a+" "+" is an alphabet");
			else System.out.println(a+" "+" not an alphabet");
				
		}
		

	}

	

}
