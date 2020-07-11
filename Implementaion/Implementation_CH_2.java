package OOD;
/*
javac -version
javac Implementation_CH_2.java -d ClassFiles
java -cp ClassFiles OOD.Implementation_CH_2
*/
class Gear{
		private int not_chainring;  //number of teeth in chaining
		private int not_cog;		//number of teeth in cog
		private float diameterOfRim;
		private float diameterOfTire;
		public Gear(int not_chainring, int not_cog,float diameterOfRim,float diameterOfTire){
			this.not_chainring=not_chainring;
			this.not_cog=not_cog;
			this.diameterOfRim=diameterOfRim;
			this.diameterOfTire=diameterOfTire;
		}
		public float ratio(){
			return (float)not_chainring/(float) not_cog;
		}
		public float gear_inches(){
			return this.ratio() * (diameterOfRim + (diameterOfTire *2));
		}
}
public class Implementation_CH_2{
	public static void main(String[] args)
	{
		// Gear object1=new Gear(52,11);  // This will give error because constructor has been modified
		// System.out.println("When Number of teeth in chaining is 52 and in cog is 11  then ratio :"+ object1.ratio());
		Gear object1=new Gear(52,11,26,1.5f);
		System.out.println("Gear_Inches :"+ object1.gear_inches());
		Gear object2=new Gear(52,11,24,1.25f);
		System.out.println("Gear_Inches :"+ object2.gear_inches());

	}
}