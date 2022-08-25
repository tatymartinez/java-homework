package classes;

public class PetClass {
	private String name;			
	private int age;
	private String location;
	private String type;
	
	public PetClass() {				
		// empty constructor
	}
	
	public PetClass(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getType() {
		return this.type;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setlocation(String location) {
		this.location = location;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PetClass dog = new PetClass("wag", 3, "los angeles", "golden retriever");
		System.out.println(dog.age);
		System.out.println(dog.location);		
		
	}

}


// reviewed this with TA Michael because I was getting confused with OOP
/* public class PetClass {
private String name;			
private int age;
private String location;
private String type;

public PetClass() {				
	// empty constructor
}

public PetClass(String name, int age, String location, String type) {
	this.name  = name;
	this.age = age;
	this.location = location;
	this.type = type;
}

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isLegal() {
	if(age >= 21) {
		return true;
	} else {
		return false;
	}
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	PetClass newPet = new PetClass("Rover", 22, "hawaii", "border-collie");
	
	System.out.println(newPet.getName());
	
	newPet.setName("Bandit");
	System.out.println(newPet.getName());
	
	System.out.println(newPet.isLegal());
	

}

}
*/