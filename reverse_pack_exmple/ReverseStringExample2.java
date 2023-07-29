package reverse_pack_exmple;
import java.util.Scanner; 

public class ReverseStringExample2 {
  
	public static void main(String args[])  
	{  
	String s;  
	Scanner sc=new Scanner(System.in); //reading string from user  
	System.out.print("Enter a String: ");  
	s=sc.nextLine();  
	System.out.print("After reverse string is: ");  
	int i=s.length();  //determining the length of the string   
	while(i>0)  
	{  
	System.out.print(s.charAt(i-1));  //printing the character at index i-1  
	i--;     //decreasing the length of the string  
	}  
	}  
	}  
