package OOD;
/*
javac -version
javac Implementation_CH_8.java -d ClassFiles
java -cp ClassFiles OOD.Implementation_CH_8
*/
import java.util.*;
class Bicycle
{
	private String size;
	private Parts parts ;
	Bicycle(String size,Parts parts){
		this.size=size;
		this.parts=parts;
	}
	public Parts parts(){
		return parts;
	}
	public String size(){
		return size;
	}
	public String spares(){
		return parts.spares();
	}
	public int partsSize(){
		return parts.partsSize();
	}
	public int sparesSize(){
		return parts.sparesSize();
	}
}
class Parts{
	private ArrayList<Part> parts = new ArrayList<>();
	Parts(ArrayList<Part> parts)
	{
		for ( Part p : parts)
		this.parts.add(p);
	}
	
	public String spares(){
		String details="";
		for(Part p : parts)
			details+=p.toString();
		return details;
	}
	public int sparesSize(){
		int count=0;
		for(Part p: parts)
		{
			if(p.needs_spare == true)
				count++;
		}
		return count;
	}
	public int partsSize(){
		return parts.size();
	}
	public static Parts add(Parts p1,Parts p2){
		Parts rp=new Parts(p1.parts);
		rp.parts.addAll(p2.parts);
		return rp;
	}

}
class Part{
	String name,description;
	boolean needs_spare;
	Part(String name, String description,Boolean needs_spare){
		this.name=name;
		this.description=description;
		this.needs_spare=needs_spare;
	}
	Part(String name, String description){
		this.name=name;
		this.description=description;
		this.needs_spare=true;
	}
	public String toString()
	{
		return "[ Name : "+ name + ", Description : "+ description + ", Needs Spare :"+ String.valueOf(needs_spare) + " ]\n";
	}

}
 public class Implementation_CH_8{
 	public static void main(String[] args)
 	{

 		Part chain= new Part("chain", "10-speed");
 		Part road_tire= new Part("tire_size","23");
 		Part tape = new Part("tape_color","red");
 		Part mountain_tire= new Part("tire_size", "2.1");
 		Part rear_shock= new Part("rear_shock", "Fox");
 		Part front_shock= new Part("front_shock", "Manitou", false);
 		ArrayList<Part> rbparts= new ArrayList<>();
 		rbparts.add(chain);
 		rbparts.add(road_tire);
 		rbparts.add(tape);
 		Parts road_bike_parts= new Parts(rbparts);

 		Bicycle road_bike=new Bicycle("L",road_bike_parts);
 		System.out.println("road_bike size  :\n"+ road_bike.size());
 		System.out.println("road_bike spares:\n"+ road_bike.spares());
 		System.out.println("road_bike spare size :\n"+ road_bike.sparesSize());
 		System.out.println("road_bike parts Size:\n"+ road_bike.partsSize());

 		ArrayList<Part> mbparts=new ArrayList<>();
 		mbparts.add(chain);
 		mbparts.add(mountain_tire);
 		mbparts.add(rear_shock);
 		mbparts.add(front_shock);

 		Bicycle mountain_bike = new Bicycle("S", new Parts(mbparts));

 		System.out.println("mountain_bike size  :\n"+ mountain_bike.size());
 		System.out.println("mountain_bike spares:\n"+ mountain_bike.spares());
 		System.out.println("mountain_bike spare size :\n"+ mountain_bike.sparesSize());
 		System.out.println("mountain_bike parts Size:\n"+ mountain_bike.partsSize());
 		Parts combo_parts=Parts.add(mountain_bike.parts(),road_bike.parts());
 		System.out.println("combine parts Size:\n"+ combo_parts.partsSize());
 		System.out.println("Combine spares:\n"+ combo_parts.spares());

 	}
 }
// Output:

// road_bike size  :
// L
// road_bike spares:
// [ Name : chain, Description : 10-speed, Needs Spare :true ]
// [ Name : tire_size, Description : 23, Needs Spare :true ]
// [ Name : tape_color, Description : red, Needs Spare :true ]

// road_bike spare size :
// 3
// road_bike parts Size:
// 3
// mountain_bike size  :
// S
// mountain_bike spares:
// [ Name : chain, Description : 10-speed, Needs Spare :true ]
// [ Name : tire_size, Description : 2.1, Needs Spare :true ]
// [ Name : rear_shock, Description : Fox, Needs Spare :true ]
// [ Name : front_shock, Description : Manitou, Needs Spare :false ]

// mountain_bike spare size :
// 3
// mountain_bike parts Size:
// 4
// combine parts Size:
// 7
// Combine spares:
// [ Name : chain, Description : 10-speed, Needs Spare :true ]
// [ Name : tire_size, Description : 2.1, Needs Spare :true ]
// [ Name : rear_shock, Description : Fox, Needs Spare :true ]
// [ Name : front_shock, Description : Manitou, Needs Spare :false ]
// [ Name : chain, Description : 10-speed, Needs Spare :true ]
// [ Name : tire_size, Description : 23, Needs Spare :true ]
// [ Name : tape_color, Description : red, Needs Spare :true ]