package OOD;
/*
javac -version
javac Implementation_CH_2.java -d ClassFiles
java -cp ClassFiles OOD.Implementation_CH_2
*/
class Wheel {

	private double diameterOfRim;
	private double diameterOfTire;

	Wheel( double diameterOfRim, double diameterOfTire){
		this.diameterOfRim = diameterOfRim;
		this.diameterOfTire = diameterOfTire;
	}

	public double diameter(){
		return (diameterOfRim + (diameterOfTire *2));
	}	
	public double circumference(){
        return Math.PI * diameter();
    }
}
class Gear{
	private int not_chainring;  //number of teeth in chaining
	private int not_cog;		//number of teeth in cog
	private Wheel wheel;

	public Gear(int not_chainring, int not_cog){
		this.not_chainring=not_chainring;
		this.not_cog=not_cog;
		this.wheel=null;
	}
	public Gear(int not_chainring, int not_cog,Wheel wheel){
		this.not_chainring=not_chainring;
		this.not_cog=not_cog;
		this.wheel = wheel;
	}
	public Gear(int not_chainring, int not_cog,double diameterOfRim, double diameterOfTire){
		this.not_chainring=not_chainring;
		this.not_cog=not_cog;
		this.wheel = new Wheel( diameterOfRim, diameterOfTire);
	}
	private int not_cog()
	{
		return not_cog;
	}
	private int not_chainring()
	{
		return not_chainring;
	}
	public double ratio(){
		return (double)not_chainring()/(double) not_cog();
	}
	public double diameter()
	{
		return wheel.diameter();
	}
	public double gear_inches(){
		return this.ratio() * this.diameter();
	}
}
public class Implementation_CH_3{
	public static void main(String[] args)
	{
		
		Gear object1=new Gear(52,11,new Wheel(26,1.5));
		System.out.println("Gear_Inches :"+ object1.gear_inches()); 

		Gear object2=new Gear(52,11,26,1.25);
		System.out.println("Gear_Inches :"+ object2.gear_inches()); 

		Wheel wheel=new Wheel(26,1.5);
		System.out.println("Wheel circumference :" + wheel.circumference());
		Gear object3=new Gear(52,11,wheel);
		System.out.println("Gear_Inches :"+ object3.gear_inches()); 

		Gear object4=new Gear(52,11);
		System.out.println("Ratio :"+ object4.ratio());
		
		// Output:
		// Gear_Inches :137.0909090909091
		// Gear_Inches :134.72727272727275
		// Wheel circumference :91.106186954104
		// Gear_Inches :137.0909090909091
		// Ratio :4.7272727272727275
	}
}