package alpha;

import java.io.BufferedInputStream;

import java.io.IOException;



public class Vowels_Consonants {

	public static void main(String[] args) throws IOException {
		for(;;){
			BufferedInputStream Scan=new BufferedInputStream(System.in);
		System.out.print("enter the charcter =");
			char a=(char) Scan.read();
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			System.out.println("vowels");
			else System.out.println("consonants");
				
		}
		

	}

}
