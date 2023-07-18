package batch_12_2;

public class AnimalMethodExample2{
	

		static void animalDetailsMethod(String dcolor,String dname,String dheight,String dweight)
		{
			System.out.println("animal details are below\n");
			System.out.println("color is"+dcolor);
			System.out.println("Name is"+dname);
			System.out.println("hieght is"+dheight);
			System.out.println("weight is"+dweight);
		}
		
		public static void main(String args[])
		{
			animalDetailsMethod("brown\n", " rocky\n","4\n","30\n");
			
		}
		}

