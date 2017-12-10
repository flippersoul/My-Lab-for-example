     /**
	 *  Автор: Скворцов П.Д.
	 */

public class balloon_phisical 
{
// константы
protected double r_air_out; // плотность воздуха снаружи шара
protected double r_gas; // плотность пропана
protected double v_ball;// объем воздушного шара 
protected double q_gas;// удельная теплота сгарания пропана
protected double c_air; // удельная теплоемкость воздуха
protected double v_part; // объем пропана вышедшего за одно нажатие 
protected double g; // 9.8 Н/м^2 
protected double m_ball;// масса карзины 
protected double q_cool;// величина на которую остывает воздух в шаре за ед.времени 
// изменяемые величины
protected double r_air_in; // плотность воздуха внутри шара
protected double t_0;// начальная температура
protected double s_0; // скорость шара начальная 
protected double v_tank;// объем пропана в болоне 
protected double h;// высота шара над землей 
protected double k_air;// коэффициент сопротивления воздуха 


public balloon_phisical()
{
// константы
r_air_out=1.293; // плотность воздуха снаружи шара
r_gas=550; // плотность пропана
v_ball=800;// объем воздушного шара 
q_gas=115000000;// удельная теплота сгарания пропана
c_air=1010; // удельная теплоемкость воздуха
v_part=0.005; // объем пропана вышедшего за одно нажатие 
g=9.8; // 9.8 Н/м^2 
m_ball=90;// масса карзины
q_cool=150000;
// изменяемые нулевые величины 
r_air_in=1.293; // плотность воздуха внутри шара
t_0=273;// начальная температура
s_0=0; // скорость шара начальная 
v_tank=0.5;// объем пропана в болоне 
h=0;// высота шара над землей 
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
