package OOD;
/*
javac -version
javac Implementation_CH_8.java -d ClassFiles
java -cp ClassFiles OOD.Implementation_CH_8
*/
class Bicycle
{
	String size;
	Parts parts;
	Bicycle(String size,Parts parts){
		this.size=size;
		this.parts=parts;
	}
	public String size(){
		return size;
	}
	public String spares(){
		return parts.spares();
	}
}
abstract class Parts{
	String chain;
	double tire_size;
	Parts(String chain,double tire_size){
		this.chain= chain==null ? default_chain() : chain;
		this.tire_size=Double.isNaN(tire_size)? default_tire_size() : tire_size;
	}
	public String spares(){
		return " chain :"+ chain + " tire_size: " + tire_size + local_spares(); 
	}
	abstract public String local_spares();
	abstract public double default_tire_size();
	public String default_chain(){
		return "10-speed";
	}
}
class RoadBikeParts extends Parts{
	private String tape_color;

	RoadBikeParts(String tape_color,String chain, double tire_size){
		super(chain,tire_size);
		this.tape_color = tape_color;
		
	} 
	public String local_spares(){
		return " tape_color :"+tape_color;
	}
	public double default_tire_size(){
		return 23;
	}
}
class MountainBikeParts extends Parts{
	private String front_shock,rear_shock;

	MountainBikeParts(String front_shock,String rear_shock,String chain, double tire_size){
		super(chain,tire_size);
		this.front_shock=front_shock;
		this.rear_shock=rear_shock;
	}
	public String local_spares(){
		return  " rear_shock :"+ rear_shock;
	}
	public double default_tire_size(){
		return 2.1;
	}
 }
 public class Implementation_CH_8{
 	public static void main(String[] args)
 	{
 		Bicycle road_bike = new Bicycle("L", new RoadBikeParts("RED",null, Double.NaN));
 		System.out.println("road_bike size  :\n"+ road_bike.size());
 		System.out.println("road_bike spares:\n"+ road_bike.spares());

 		Bicycle mountain_bike = new Bicycle("S", new MountainBikeParts(null, "Fox",null,Double.NaN));
 		System.out.println("mountain_bike size  :\n"+ mountain_bike.size());
 		System.out.println("mountain_bike spares:\n"+ mountain_bike.spares());

 	}
 }
// Output:

// road_bike size  :
// L
// road_bike spares:
//  chain :10-speed tire_size: 23.0 tape_color :RED
// mountain_bike size  :
// S
// mountain_bike spares:
//  chain :10-speed tire_size: 2.1 rear_shock :Fox