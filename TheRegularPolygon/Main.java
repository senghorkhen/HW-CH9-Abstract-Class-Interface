package TheRegularPolygon;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<RegularPolygon> addValues = new ArrayList<>();
		
		Square square = new Square(2);
		EquilateralTriangle equilateralTriangle = new EquilateralTriangle(8);
		
		addValues.add(square);
		addValues.add(equilateralTriangle);
		System.out.println("NumSide of RegularPolygon is: " + RegularPolygon.getTotalSide(addValues));
	}

}
