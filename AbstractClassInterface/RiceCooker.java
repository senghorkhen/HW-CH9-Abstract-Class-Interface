package AbstractClassInterface;

public class RiceCooker extends Thing {
	private int age;
	private int numberOfUse;
	public RiceCooker(String name,int age, int numberOfUse) {
		super(name);
		this.age = age;
		this.numberOfUse = numberOfUse;
	}
	@Override
	public boolean isValid() {
		if(age <5 && numberOfUse < 500) {
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
