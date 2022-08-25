package classes;

public class PetClass {
	private String name;			// can this be str
	private int age;
	private String location;
	private String type;
	
	public PetClass() {				// unsure if i did this correctly
		// empty constructor
	}
	
	public PetClass() {				// it said 2 constructors.  would that mean they need the same name
		// empty constructor			// since they belong to PetClass class?
		
		
	}
	
	public void getMethods(String getPetName, int getPetAge, String getPetType) {
		name = getPetName; 			// can we just put name?
		age = getPetAge;
		type = getPetType;
	}
	
	public void setMethods(String setPetName, int setPetAge, String setPetLocation) {
		name = setPetName;						
		age = setPetAge;
		location = setPetLocation;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
