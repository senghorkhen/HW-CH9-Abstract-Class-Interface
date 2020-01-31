package AbstractClassInterface;

public class Bike extends Thing {
	private int age;
	private boolean isFrontBreakWorking;
	private boolean isBackBreakWorking;
	
	Bike(String name,int age, boolean isFrontBreakWorking, boolean isBackBreakWorking){
		super(name);
		this.age = age;
		this.isFrontBreakWorking = isFrontBreakWorking;
		this.isBackBreakWorking = isBackBreakWorking;
	}
	
	@Override
	public boolean isValid() {
		if(age < 2 && (isFrontBreakWorking || isBackBreakWorking)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String value = "";
		if(isValid()) {
			value = super.toString() + " Valid";
		}else {
			value = super.toString() + " inValid";
		}
		return value;
	}
	
}
