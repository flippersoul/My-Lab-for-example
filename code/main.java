package classes;
import java.applet.Applet;
import java.awt.*;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		balloon_phisical a=new balloon_phisical();
		for (int i=0;i<=10;i++)
		{
			System.out.println("t_0="+a.t_0+"	h="+a.h);
			System.out.println(a.event_fire());
			System.out.println(a.event_fire());
			System.out.println(a.event_fire());
			System.out.println(a.event_fire());
			System.out.println(a.event_without_fire());
			System.out.println(a.event_without_fire());
			System.out.println(a.event_without_fire());
			System.out.println(a.event_without_fire());
			System.out.println(a.event_without_fire());
		}
		// TODO Auto-generated method stub

	}

}
