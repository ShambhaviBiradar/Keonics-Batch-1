package conditionalStatements;

public class Java_6_NestedIfExample2 {      
	public static void main(String[] args) {      
	    //Creating two variables for age and weight    
	    int age=17;    
	    int weight=80;      
	    //applying condition on age and weight    
	    if(age>=18){      
	        if(weight>50){    
	            System.out.println("You are eligible to donate blood");    
	        }
	        else{  
	            System.out.println("You are not eligible to donate blood");    
	        }  
	    }
	    else{  
	      System.out.println("Age must be greater than 18");  
	    }  
	}  }  
