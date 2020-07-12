package OOD;
/*
javac -version
javac Implementation_CH_4.java -d ClassFiles
java -cp ClassFiles OOD.Implementation_CH_4
*/
abstract class Bicycle{
	public String size,chain;
	double tire_size;
	public Bicycle(String size,String chain,double tire_size){
		this.size=size;
		this.tire_size=tire_size;
		this.chain = chain;
	}
	public String size(){
		return size;
	}
	public String spares(){
		return " chain : "+chain+" tire_size : "+tire_size;
	}
}
class RoadBike extends Bicycle
{

	private String chain,tape_color;
    protected double tire_size;
	public RoadBike(String size,String tape_color){
		
		super(size,"10-speed",23);
		this.tape_color = tape_color;
	}
	public String tape_color(){
		return tape_color;
	}
	public String spares(){
		return super.spares()+" tape_color : "+ tape_color;
	}
	

}
class MountainBike extends Bicycle
{
	private String front_shock,rear_shock;
	double tire_size;
	public MountainBike(String size,String front_shock,String rear_shock)
	{
		super(size,"20-speed",2.1);
		this.front_shock=front_shock;
		this.rear_shock=rear_shock;
		
	}
	public String front_shock(){
		return front_shock;
	}
	public String rear_shock(){
		return front_shock;
	}
	public String spares(){
		
		return super.spares()+" rear_shock : "+rear_shock;
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
		//  chain : 20-speed tire_size : 2.1 rear_shock : Fox
		// RoadBike size :M
		// RoadBike spares :
		//  chain : 10-speed tire_size : 23.0 tape_color : red
	}
}