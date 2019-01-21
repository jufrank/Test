/* ************************************************************************** *\
*  Factorial								Author	Jasmin Sert		14-620-579 *
*													Damaris Meier	15-113-665 *
*																			   *
*                   	  Programmierung 1 HS 2016                             *
*                          		Aufgabe 6-1-2                                  *
\* ************************************************************************** */

import java.util.Scanner;

public class Factorial {
	
	public static long factorial(int n){
		long fact;
		int count=0;
		
		System.out.println("Anzahl = " + count );
		count++;
		
		if (n==0){
			fact = 1;
			return fact;
		}
		
		else{
			fact = n*factorial(n-1);
			return fact;
		}
	}
	
	public static void main( String[] args ){
		/* Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String[] lines = line.split("Factorial ");
		int i = Integer.parseInt(lines[1]);*/
		
		int i = Integer.parseInt(args[0]);
		
		System.out.println(factorial(i));
	}
}
