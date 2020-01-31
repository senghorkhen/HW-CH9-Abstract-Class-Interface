package TheRegularPolygon;

public class EquilateralTriangle extends Rid{
	

	public EquilateralTriangle(int length) {
		super(length);
	}

	public  final int DEFAUL_NUMSIDE = 3;
	 
	@Override
	public int getNumSides() {
		return DEFAUL_NUMSIDE;
	}

	@Override
	public int getSideLength() {
		return 0;
	}
}
