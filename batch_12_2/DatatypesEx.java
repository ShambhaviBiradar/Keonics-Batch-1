package batch_12_2;
import java.io.DataInputStream;

public class DatatypesEx {
	
	public static void main(String args[]) throws Exception
	{
	DataInputStream s1=new DataInputStream(System.in);
	byte rollno;
	int marks1,marks2,marks3;
	float avg;
	System.out.println("Enter roll number:");
	rollno=Byte.parseByte(s1.readLine());
	System.out.println("Enter marks m1, m2,m3:");
	marks1=Integer.parseInt(s1.readLine());
	marks2=Integer.parseInt(s1.readLine());
	marks3=Integer.parseInt(s1.readLine());
	avg = (marks1+marks2+marks3)/3;
	System.out.println("Roll number is="+rollno);
	System.out.println("Average is="+avg);
	}
	}