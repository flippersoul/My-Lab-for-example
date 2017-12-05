//package classes;
import java.applet.Applet;
import java.awt.*;
 
public class balloon_phisical 
{
	// constants
	protected double r_air_out;  // ��������� ������� ������� ����
	protected double r_gas; 	// ��������� �������
	protected double v_ball;	// ����� ���������� ���� 
	protected double q_gas;		// �������� ������� �������� �������
	protected double c_air;  	// �������� ������������ �������
	protected double v_part; 	// ����� ������� ��������� �� ���� ������� 
	protected double g;		 	// 9.8 �/�^2 
	protected double m_ball;	// ����� ������� 
	protected double q_cool;	// �������� �� ������� �������� ������ � ���� �� ��.������� 
	// dynamic
	protected double r_air_in;  // ��������� ������� ������ ����
	protected double t_0;		// ��������� �����������
	protected double s_0;	 	// �������� ���� ��������� 
	protected double v_tank;	// ����� ������� � ������ 
	protected double h;			// ������ ���� ��� ������ 
	protected double k_air;		// ����������� ������������� ������� 
	
	
	public balloon_phisical()
	{
		// constants
		r_air_out=1.293;  // ��������� ������� ������� ����
//		r_gas=550; 	// ��������� �������
		v_ball=800;	// ����� ���������� ���� 
		q_gas=115000000;		// �������� ������� �������� �������
		c_air=1010;  	// �������� ������������ �������
		v_part=0.005; 	// ����� ������� ��������� �� ���� ������� 
		g=9.8;		 	// 9.8 �/�^2 
		m_ball=90;	// ����� �������
		q_cool=150000;
		// dynamic null values
		r_air_in=1.293;  // ��������� ������� ������ ����
		t_0=273;		// ��������� �����������
		s_0=0;	 	// �������� ���� ��������� 
		v_tank=0.5;	// ����� ������� � ������ 
		h=0;			// ������ ���� ��� ������ 
		k_air=4;
	}
	
	public double event_fire()
	{
		double d_t,a,chislit, znamenat;
		double t_stage=5;
		if (v_tank<=0)
		{
			v_tank=0;
			event_without_fire();
		}
		else
		{
		chislit=q_gas*v_part-q_cool;
		znamenat=r_air_in*c_air*v_ball;
		d_t=((q_gas*v_part-q_cool)/(r_air_in*c_air*v_ball));
		r_air_in=(r_air_in*t_0/(t_0+d_t));
		a=-g+(r_air_out*g*v_ball)/(m_ball+r_air_in*v_ball);
		System.out.println("t_0="+t_0+"	h="+h);
		System.out.println("d_t="+d_t+"		chislit="+chislit+"		znamenet="+znamenat+"	a="+a);
		System.out.println("r_in="+r_air_in+"		r_out="+r_air_out);
		a=a/k_air;
		if (a>2)
			a=2;
		h=h+s_0*t_stage+a*t_stage*t_stage/2;
		s_0=s_0+a*t_stage;
		if (s_0>80)
			s_0=80;
		t_0=t_0+d_t;
		v_tank=v_tank-v_part;
		if (h<=0)
		{
			s_0=0;
			h=0;
		}
		}
		return h;
	}

	public double event_without_fire()
	{
		double d_t,a,chislit, znamenat;
		double t_stage=5;
		
		chislit=-q_cool;
		znamenat=r_air_in*c_air*v_ball;
		d_t=((-q_cool)/(r_air_in*c_air*v_ball));
		r_air_in=(r_air_in*t_0/(t_0+d_t));
		a=-g+(r_air_out*g*v_ball)/(m_ball+r_air_in*v_ball);
//		if (d_t<0)
//			a=a*(-1);
		System.out.println("t_0="+t_0+"	h="+h);
		System.out.println("d_t="+d_t+"		chislit="+chislit+"		znamenet="+znamenat+"	a="+a);
		a=a/k_air;
		h=h+s_0*t_stage+a*t_stage*t_stage/2;
		s_0=s_0+a*t_stage;
		if (s_0>80)
			s_0=80;
		t_0=t_0+d_t;
		if (t_0<273)
			t_0=273;
		if (h<=0)
		{
			s_0=0;
			h=0;
		}

		return h;
	}


}
