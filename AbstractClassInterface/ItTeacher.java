package AbstractClassInterface;

public class ItTeacher extends Thing {
	
	private int yearsOfExperience;
	
	//constructor
	public ItTeacher(String name, int yearsOfExperience) {
		super(name);
		this.yearsOfExperience = yearsOfExperience;
		
	}

	@Override
	public boolean isValid() {
		boolean isValidItTeacher = false;
		if(yearsOfExperience > 2) {
			return true;
		}
		return isValidItTeacher;
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