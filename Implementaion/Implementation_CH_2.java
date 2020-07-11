package OOD;
/*
javac -version
javac Implementation_CH_2.java -d ClassFiles
java -cp ClassFiles OOD.Implementation_CH_2
*/
class Gear{
		private int not_chainring;  //number of teeth in chaining
		private int not_cog;		//number of teeth in cog
		public Gear(int not_chainring, int not_cog){
			this.not_chainring=not_chainring;
			this.not_cog=not_cog;
		}
		public float ratio(){
			return (float)not_chainring/(float) not_cog;
		}
}
public class Implementation_CH_2{
	public static void main(String[] args)
	{
		Gear object1=new Gear(52,11);
		System.out.println("When Number of teeth in chaining is 52 and in cog is 11  then ratio :"+ object1.ratio());
		Gear object2=new Gear(30,27);
		System.out.println("When Number of teeth in chaining is 30 and in cog is 27  then ratio :"+ object2.ratio());

	}
}