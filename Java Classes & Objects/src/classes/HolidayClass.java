package classes;

public class HolidayClass {
	private String holiday;
	private String food;
	private String color;
	
	// empty constructor
	public HolidayClass() {
	}
	
	// constructor that uses 2/3 variables
	public HolidayClass(String holiday, String food) {
		this.holiday = holiday;
		this.food = food;
	}
	
	// constructor that uses all 3 variables
	public HolidayClass(String holiday, String food, String color) {
		this.holiday = holiday;
		this.food = food;
		this.color = color;
	}
	
	// Getters
	public String getHoliday() {
		return this.holiday;
	}
	
	public String getFood() {
		return food;
	}
	
	public String getColor() {
		return color;
	}
	
	// Setters
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// Method that returns a Boolean
	public Boolean isHolidayChristmas() {
		if (holiday == "Christmas") {
			return true;
		} else {
			return false;
		}
	}
	
	// Method that returns a String
	public String isFavoriteHolidayChristmas() {
		if (isHolidayChristmas() == true) {
			return "My favorite holiday is actually " + holiday;
		} else {
			return "My favorite holiday is not Christmas";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HolidayClass ravensChoice = new HolidayClass("Christmas", "pie", "green");
		System.out.println(ravensChoice.isFavoriteHolidayChristmas());
		System.out.println(ravensChoice.food);
		System.out.println(ravensChoice.color);
		
		HolidayClass bobsChoice = new HolidayClass("Halloween", "pumpkin pie", "orange");
		System.out.println(bobsChoice.isFavoriteHolidayChristmas());
		System.out.println(bobsChoice.food);
		System.out.println(bobsChoice.color);
				
	}

}


