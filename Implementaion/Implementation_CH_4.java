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
	Bicycle(String style,String size,String front_shock,String arg){
		this.style=style;
		this.size = size;
		this.front_shock=front_shock;
		
		this.chain = "10-speed";
		if( style.equals("road")){	
			this.tire_size = 23;
			this.tape_color = arg;
		}
		else{
			this.tire_size=2.1;
			this.rear_shock=arg;
		}
		
	}
	public String style(){
		return style;
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
	public String rear_shock(){
		return rear_shock;
	}
	public String spares(){
		if(style.equals("road"))
			return "[ chain : "+chain+" tire_size : "+tire_size+" tape_color : "+ tape_color+" ]";
		else
			return "[ chain : "+chain+" tire_size : "+tire_size+" rear_shock : "+ rear_shock+" ]";

	}

}
public class Implementation_CH_4{
	public static void main(String[] args)
	{
		Bicycle bike=new Bicycle("mountain","S","Manitou","Fox");
		System.out.println("Bike.size :"+ bike.size());
		System.out.println("Bike.spares :"+ bike.spares());

		// Output:
		// Bike.size :S
		// Bike.spares :[ chain : 10-speed tire_size : 2.1 rear_shock : Fox ]
	}
}