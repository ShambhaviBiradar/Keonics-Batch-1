package batch_12_2;

public class MethodAnimalExample {

static void showColorMethod(String dcolor)
{
	System.out.println("dog color is   " +dcolor);
}
static void showNameMethod(String dname)
{
	System.out.println("dog name is"+dname);	
}
static void showHeightMethod(int dheight)
{
	System.out.println("dog height in feet  "+dheight);	
}
static void showWeightMethod(int dweight)
{
	System.out.println("dog weight in feet  "+dweight);	
}
public static void main(String args[])
{
	showColorMethod("brown");
	showNameMethod("rockey");
	showHeightMethod(4);
	showWeightMethod(30);
}
}