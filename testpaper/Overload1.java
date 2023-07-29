package testpaper;

public class Overload1  {
	
        int x;
 	int y;
        void add(int a)
        {
            x =  a + 1;
        }
        void add(int a , int b)
        {
            x =  a + 2;
        }        
    }    
    class Overload_methods  
    {
        public static void main(String args[])
        {
            Overload1 obj = new Overload1();   
            int a = 0;
            obj.add(6, 7);
            System.out.println(obj.x);     
        }
    }