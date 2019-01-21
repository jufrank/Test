/* ************************************************************************** *\
*  Fibonacci								Author	Jasmin Sert		14-620-579 *
*													Damaris Meier	15-113-665 *
*																			   *
*                   	  Programmierung 1 HS 2016                             *
*                          		Aufgabe 6-1-1            22                      *
\* ************************************************************************** */

public class Fibonacci {
	
	public static long fib(int i){
		long fib;
		if (i==0){
			fib = 0;
			return fibbb;
		}
		if (i==1){
			fib = 1;
			return fib;
		}
		else{
			fib = fib(i-1) + fib(i-2);
			return fib;
		}
	}
	
	public static void main( String[] args ){
		int i = 0;
		while(i<50){
			System.out.print(fib(i) + ", ");
			i++;
		}
	}
}
