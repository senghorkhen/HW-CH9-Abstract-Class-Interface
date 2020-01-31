package TheRegularPolygon;

import java.util.ArrayList;
import java.util.List;

public interface RegularPolygon {
	public int getNumSides();
	public int getSideLength();
	
//	public static int getTotalSide(List<RegularPolygon> addValues) {
//		
//		
//	}
	public static int getTotalSide(List<RegularPolygon> addValues) {
		int resultOfValue = 0;
		for(RegularPolygon regularPolygon : addValues) {
			resultOfValue += regularPolygon.getNumSides();
		}
		return resultOfValue;
	}
		
}