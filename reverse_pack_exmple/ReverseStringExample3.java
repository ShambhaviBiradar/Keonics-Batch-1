package reverse_pack_exmple;

import java.util.Scanner;  
public class ReverseStringExample3  
{  
public static void main(String[] arg)  
{  
ReverseStringExample3 rev=new ReverseStringExample3();  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a string : ");  
String  s=sc.nextLine();      
System.out.println("Reverse String  is : "+rev.reverse(s)); //calling method  
}  
//calling method   
static String reverse(String str)  
{  
String rev="";  
for(int i=str.length();i>0;--i)  
{  
rev=rev+(str.charAt(i-1));   
}  
return rev;  
}  
}  
