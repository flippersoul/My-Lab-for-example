// <applet code=start_app width=800 height=600></applet>

//package classes;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.math.*;
import balloon_phisical.java;

import pointer.ButtonPanel.ColorAction;


public class start_app extends Applet implements KeyListener, Runnable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 550417251998005070L;
	balloon_phisical ball;
	Point position;
	Point position_d;
	String nmfile;
	Image Img;
	Image Img_fon;
	Thread animator_ball; 
	Thread animator_fon; 
    volatile boolean pleaseStop;

    int helth=1;
	int kl=0;
	int x = 5, y = 5;
	int dx = 2, dy = 1;
	int pos;
	int derection = 0;
	int first_y;
	int v=0;
	final TextField text_1=new TextField("null");
	final TextField text_2=new TextField("null");
	final TextField text_3=new TextField("null");
	final TextField text_4=new TextField("null");
	final TextField text_5=new TextField("������ ���������!");
	final Button butt_1=new Button ("���������");
	final Button butt_2=new Button ("�������������");

	
	public void init()
	{
		setSize(/*DEFAULT_WIDTH*/800,/*DEFAULT_HEIGHT*/ 600);
		setName("ButtonTest");

		setLayout(null);
		first_y=150;
		ball= new balloon_phisical();
		position=new Point(0,0);
		position_d=new Point(0,0);
		position.x=250;
		position.y=first_y-(int)ball.h/40;
		first_y=position.y;
		position_d.x=(position.x+300)-(int)((position.x+300)/1100)*1100;
		position_d.y=(position.y+373)-(int)((position.y+373)/973)*973;

		pos = 10;
		Img = getImage(getDocumentBase(), "ball.png");
		Img_fon = getImage(getDocumentBase(), "back.png");

		this.addKeyListener( this);
	   	this.setFocusable(true);
	   
		this.add(text_1);
		this.add(text_2);
		this.add(text_3);
		this.add(text_4);
		this.add(text_5);
	//	this.add(butt_1);
	//	this.add(butt_2);
		text_1.setBounds(0, 0, 140, 20);
		text_2.setBounds(0, 20, 140, 20);
		text_3.setBounds(0, 40, 140, 20);
		text_4.setBounds(0, 60, 140, 20);
		text_5.setBounds(140, 0, 400, 20);
		butt_1.setBounds(660, 0, 140, 20);
		butt_2.setBounds(660, 20, 140, 20);
		
		butt_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(final ActionEvent e) 
			{
			   	run();
				
//				animate();
//			final Graphics g = getGraphics();
			}
		});
		butt_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(final ActionEvent e) 
			{
				ball.event_without_fire();
//				final Graphics g = getGraphics();
			}
		});
	}
	

	public void paint(final Graphics g) 
	{
/*		int kx=(int)(position.x+300)/1100;
		int ky=(int)(position.y+373)/973;
		position_d.x=position.x-kx*1100;
		position_d.y=position.y-ky*973;
	*/

		

	//position_d.x=(position.x+300)-(int)((position.x+300)/1100)*1100-300;
		//position_d.y=(position.y+373)-(int)((position.y+373+973)/973)*973-373;

		g.drawImage(Img_fon, 0, 0,this);
		
//		g.drawImage(Img,position.x,position.y,this);
		if (helth==1)
			g.drawImage(Img,position.x,position.y,this);
		else
		{
			g.drawImage(Img,0,15,this);
			text_5.setText("Geme over!!!");
			stop();
		}
		}
	 
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		Graphics panel=this.getGraphics();
		int dd=10;
		int Key = arg0.getKeyCode();
		switch(Key)
		{
	
			case KeyEvent.VK_LEFT:
				if (arg0.isShiftDown())	
					dd=20;
				if (ball.h>0)
					position.x=position.x-4;
				break;
			case KeyEvent.VK_RIGHT:
				if (arg0.isShiftDown())	
					dd=20;
				if (ball.h>0)
					position.x=position.x+4;
				break;
			case KeyEvent.VK_UP:
				ball.event_fire();
				break;
			case KeyEvent.VK_DOWN:
//				ball.event_without_fire();
				break;
			case KeyEvent.VK_SPACE:
				if (ball.h==0)
					ball.v_tank=ball.v_tank+0.25;
				break;
			}
	}

	public void keyReleased(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void animate_ball() 
	{
		int k;
		long timeStart;
		long timeFinish;
		timeStart=System.currentTimeMillis();
		while (true)
		{
			timeFinish=System.currentTimeMillis();
			if ((int)(timeFinish-timeStart)>100 ) 
				break;
		}
		int old_x=position.x;
		int old_y=position.y;
		
		if (ball.h>0)
			ball.event_without_fire();
		
		
		position.y=first_y-(int)ball.h/40;

		int dd_x=Math.abs(old_x-position.x);
		int dd_y=Math.abs(old_y-position.y);
		
		nmfile = "ball.png";
		Img = getImage(getDocumentBase(), nmfile);
//		g.drawImage(Img,start.x,400-(int)ball.h/40,this);
//		if (dd_x>1 || dd_y>1)
/*		if ((int)Math.(position.y+373)/973>1)
		{
			Img_fon = getImage(getDocumentBase(), "fon_2.jpg");
			v=v+1;
		}
		if (position.y>600)
		{
			position.y=-373;
			
			Img_fon = getImage(getDocumentBase(), "fon_2.jpg");
		}
*/		
		int bbb=0;
		kl=0;
		Img_fon = getImage(getDocumentBase(), "back.png");
		while (position.y<-373)
			
		{	
			kl++;
			position.y=position.y+973;
			bbb=1;
			if (kl==6)
			{
				helth=0;
				break;
			}
			if (kl==5)
			{
				Img_fon = getImage(getDocumentBase(), "fon_3.jpg");
				if (position.y<first_y)
				{
					Img = getImage(getDocumentBase(), "bum.gif");
	//				helth=0;
				}
				break;
			}
			Img_fon = getImage(getDocumentBase(), "fon_2.jpg");
		}
		while (position.x<-300)
			
		{	
			position.x=position.x+1100;
			bbb=1;
		}
		while (position.x>800)
			
		{	
			position.x=position.x-1100;
			bbb=1;
		}
		text_5.setText("������!!!");
		if (Math.abs(ball.s_0)>40)
			text_5.setText("������ ��������!!!");
		if (ball.v_tank<0.5)
			text_5.setText("���� �������!!!");
		if (Math.abs(ball.s_0)>40 && ball.v_tank<0.5)
			text_5.setText("������ ��������!!! ���� �������!!!");
		if (ball.h<2000 && Math.abs(ball.s_0)>40)
		{
			Img = getImage(getDocumentBase(), "bum_atom.gif");
			helth=0;
			bbb=1;
		}
		
		if (bbb==1)
			repaint();
		else
			repaint(old_x,old_y, 300+dd_x,373+dd_y);

		text_1.setText("������:"+String.valueOf((float)ball.h)+" �");
		text_2.setText("������:"+String.valueOf((float)ball.v_tank)+" �3");
		text_3.setText("��������:"+String.valueOf((float)ball.s_0)+" �/�");
		text_4.setText("�����������:"+String.valueOf((float)ball.t_0)+" �");
	}

		public void run() 
		{
			while(!pleaseStop) 
			{  
				animate_ball(); 
				try 
				{
					Thread.sleep(10);
				} 
				catch(InterruptedException e) {}
			}
	    }
		
	    public void start() 
	    {
	    	animator_ball = new Thread(this);  
	    	pleaseStop = false; 
	    	animator_ball.start(); 
	    }
	    
	    public void stop() 
	    {
	    	pleaseStop = true;
	    }

	
}

