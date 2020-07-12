package OOD;
/*
javac -version
javac Implementation_CH_4.java -d ClassFiles
java -cp ClassFiles OOD.Implementation_CH_4
*/
class Bicycle
{
	private String style,size, chain,tape_color,front_shock,rear_shock;
    protected double tire_size;

    Bicycle(String size){
		this.style=style;
		this.size = size;
		this.tire_size = 2.1;
		this.chain="10-speed";
		this.style="mountain";
		
	}
	Bicycle(String size,String front_shock,String tape_color){
		this.style="road";
		this.size = size;
		this.front_shock=front_shock;
		this.tire_size = 23;
		this.chain="10-speed";
		this.tape_color = tape_color;
	}
	public String size(){
		return size;
	}
	public String tape_color(){
		return tape_color;
	}
	public String front_shock(){
		return front_shock;
	}
	public String spares(){
		if(style.equals("road"))
			return " chain : "+chain+" tire_size : "+tire_size+" tape_color : "+ tape_color;
		else
			return " chain : "+chain+" tire_size : "+tire_size+" rear_shock : ";

	}

}
class MountainBike extends Bicycle
{
	private String front_shock;
	private String rear_shock;
	MountainBike(String size,String front_shock,String rear_shock)
	{
		super(size);
		this.front_shock=front_shock;
		this.rear_shock=rear_shock;
		
	}
	public String front_shock(){
		return front_shock;
	}
	public String spares(){
		
		return super.spares()+ rear_shock;

	}
}
public class Implementation_CH_4{
	public static void main(String[] args)
	{
		MountainBike bike=new MountainBike("S","Manitou","Fox");
		System.out.println("Bike.size :"+ bike.size());
		System.out.println("Bike.spares :\n"+ bike.spares());

		// Output:
		// Bike.size :S
		// Bike.spares :
		//  chain : 10-speed tire_size : 2.1 rear_shock : Fox
	}
}