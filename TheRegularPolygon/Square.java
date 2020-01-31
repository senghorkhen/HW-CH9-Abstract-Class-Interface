package TheRegularPolygon;

public class Square extends Rid{
	
	public Square(int length) {
		super(length);
	}

	public final int DEFAUL_NUMSIDE = 4;

	@Override
	public int getNumSides() {
		return DEFAUL_NUMSIDE;
	}

	@Override
	public int getSideLength() {
		return 0;
	}

}
