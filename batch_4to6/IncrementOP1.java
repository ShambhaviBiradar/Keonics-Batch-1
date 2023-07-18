package batch_4to6;

public class IncrementOP1 {
	
	    public static void main(String arg[])
	    {
	        int i = 5;
	        
	        i=i++;
	        
	        //behind the scene 
	        //int temp;
	        //temp=i;
	        //i++;
	        //temp;
	        
	        
	        System.out.println( i );
	        
	        //int j = i++;
	        
	      //  int k = ++j;
	        //i++;
	        
	        
	       
	       // int j = ++i;   //6, this is  pre increment,  first increment and then it will assign value 
	    
	      //int j = i++; //5, this is post increment, first assign then increment
	    
	       // System.out.println( i );
	  //  System.out.println( j );
	    //System.out.println( j + " : "+ i );
	    }
	}