package batch_12_2;

public class DogMethod {
	
	

		  // Create a checkAge() method with an integer parameter called age
		  static void checkHeight(int height) {

		    // If age is less than 18, print "access denied"
		    if (height > 5) {
		      System.out.println("mom tiger"); 
		      
		    // If age is greater than, or equal to, 18, print "access granted"
		    } else {
		      System.out.println("baby tiger"); 
		    }
		    
		  } 

		  public static void main(String[] args) { 
		    checkHeight(4); // Call the checkAge method and pass along an age of 20
		  } 
		}
