package OOD;
/*
javac -version
javac Implementation_CH_4.java -d ClassFiles
java -cp ClassFiles OOD.Implementation_CH_4
*/
class Bicycle
{
	private String size, chain,tape_color;
    protected double tire_size;
	Bicycle(String size,String tape_color){
		this.size = size;
		this.tape_color = tape_color;
		this.chain = "10-speed";
		this.tire_size = 23;
	}
	public String size(){
		return size;
	}
	public String tape_color(){
		return tape_color;
	}
	public String spares(){
		return "[ chain : "+chain+" tire_size : "+tire_size+" tape_color : "+ tape_color+" ]";
	}

}
public class Implementation_CH_4{
	public static void main(String[] args)
	{
		Bicycle bike=new Bicycle("M","red");
		System.out.println("Bike.size :"+ bike.size());
		System.out.println("Bike.spares :"+ bike.spares());

		// Output:
		// Bike.size :M
		// Bike.spares :[ chain : 10-speed tire_size : 23.0 tape_color : red ]
	}
}