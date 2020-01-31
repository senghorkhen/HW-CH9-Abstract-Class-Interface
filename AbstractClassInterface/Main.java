package AbstractClassInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// object of Bike
		Bike bike1 = new Bike("BikeForSport",1,false,true);
		Bike bike2 = new Bike("BikeForChild",5,false,true);
		
		// object of RiceCooker
		RiceCooker rice = new RiceCooker("BayChha",1,400);
		RiceCooker rice1 = new RiceCooker("BaySatJruk",5,600);
		
		// object of ItTeacher
		ItTeacher teacher1 = new ItTeacher("Channak",7);
		ItTeacher teacher2 = new ItTeacher("Rady",1);
		
		// add data into array list
		List<Thing> allThings = new ArrayList<>();
		
		allThings.add(bike1);
		allThings.add(bike2);
		
		allThings.add(rice);
		allThings.add(rice1);
		
		// add data into array list
		allThings.add(teacher1);
		allThings.add(teacher2);		
		
		System.out.println(bike1 );
		System.out.println(bike2);
		
		System.out.println(rice);
		System.out.println(rice1);
		
		System.out.println(teacher1);
		System.out.println(teacher2);
	
	}

}
