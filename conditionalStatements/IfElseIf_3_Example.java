package conditionalStatements;

public class IfElseIf_3_Example {
		public static void main(String[] args) {  
		    int marks=110;  
		      
		    if(marks<35){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=50 && marks<60){ // false
		        System.out.println("D grade");  
		    }  
		    else if(marks>=60 && marks<70){  //true
		        System.out.println("C grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=80 && marks<90){  //true
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }  
		}  
}  