package extendedPortion;


class Computer
{
	public void playMusic()
	
	{
		System.out.println("Music is playing!");
	}
	
	public String getMeAPen(int cost)
	{
		return "Pen";
	}
	
}

public class Demo {
	
	public static void main(String a[])
	{
		Computer obj = new Computer();
		obj.playMusic();
		//obj.getMeAPen(10);
		String str = obj.getMeAPen( 0);
		System.out.println(str);
		
	}

}
