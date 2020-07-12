package OOD;
/*
javac -version
javac Implementation_CH_4.java -d ClassFiles
java -cp ClassFiles OOD.Implementation_CH_4
*/
abstract class Bicycle{
	public abstract String spares();
}
class RoadBike extends Bicycle
{

	private String size, chain,tape_color;
    protected double tire_size;
	RoadBike(String size,String tape_color){
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
		return " chain : "+chain+" tire_size : "+tire_size+" tape_color : "+ tape_color;
	}
	

}
class MountainBike extends Bicycle
{
	private String size, chain,front_shock,rear_shock;
	double tire_size;
	MountainBike(String size,String front_shock,String rear_shock)
	{
		this.size=size;
		this.front_shock=front_shock;
		this.rear_shock=rear_shock;
		this.tire_size = 2.1;
		this.chain="10-speed";
		
	}
	public String size(){
		return size;
	}
	public String front_shock(){
		return front_shock;
	}
	public String rear_shock(){
		return front_shock;
	}
	public String spares(){
		
		return " chain : "+chain+" tire_size : "+tire_size+" rear_shock : "+rear_shock;
	}
}
public class Implementation_CH_4{
	public static void main(String[] args)
	{
		MountainBike mbike=new MountainBike("S","Manitou","Fox");
		System.out.println("MounttainBike size :"+ mbike.size());
		System.out.println("MountainBike spares :\n"+ mbike.spares());

		RoadBike rbike=new RoadBike("M","red");
		System.out.println("RoadBike size :"+ rbike.size());
		System.out.println("RoadBike spares :\n"+ rbike.spares());

		// Output:
		// MounttainBike size :S
		// MountainBike spares :
		//  chain : 10-speed tire_size : 2.1 rear_shock : Fox
		// RoadBike size :M
		// RoadBike spares :
		//  chain : 10-speed tire_size : 23.0 tape_color : red
	}
}