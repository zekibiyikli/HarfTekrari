package harfTekrar�;

import java.util.Scanner;

public class Main {
	static char[] letter= {',','.',' ','a','b','c','�','d','e','f','g','�','h','�','i','j','k','l','m','n','o','�','p','r','s','�','t','u','�','v','y','z'};
	static int[] result= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	static String cumle;
	static char textchar;

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("C�mleyi giriniz: ");
		cumle=input.nextLine();
		cumle=cumle.toLowerCase();
		
		for(int i=0;i<cumle.length();i++) {
			 textchar=cumle.charAt(i);
			 
			 for(int j=0;j<letter.length;j++) {
				 if(textchar==letter[j]) {
					 result[j]++;
					 break;
				 }
			 }
		}
		
		for(int i=0;i<result.length;i++) {
			System.out.println(letter[i]+" "+result[i]+" adet var");
		}
	}

}
