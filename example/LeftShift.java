package pack.example;

public class LeftShift {
	
	
		public static void main(String args[]) {
		 int a = 10;
		 int b = 20;
		 int c = 0;
		
		 c <<= 2 ;
		 System.out.println("c <<= 2 = " + c );
		 c >>= 2 ;
		 System.out.println("c >>= 2 = " + c );
		 c >>= 2 ;
		 System.out.println("c >>= a = " + c );
		 c &= a ;
		 System.out.println("c &= 2 = " + c );
		 c ^= a ;
		 System.out.println("c ^= a = " + c );
		 c |= a ;
		 System.out.println("c |= a = " + c );
		}
		}