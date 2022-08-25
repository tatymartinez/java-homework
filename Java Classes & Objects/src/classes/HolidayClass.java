package classes;

public class HolidayClass {
	private String food;
	private String song;
	private String holiday;
	
	public HolidayClass() {
		// empty constructor
	}
	
	public HolidayClass(String favoriteFood, String favoriteSong, String favoriteHoliday) {
		// constructor with 3 instance variables
		food = favoriteFood;
		song = favoriteSong;
		holiday = favoriteHoliday;
		
	}
	
	public HolidayClass(String favoriteSong, String favoriteHoliday) {
		// constructor with 2/3 of my variables
		song = favoriteSong;
		holiday = favoriteHoliday;
		
	}
	
	public void whatIsFavSong (String favoriteSong) {
		// get method 1
		System.out.println("My favorite song is " + favoriteSong);
	}
	
	public void whatIsFavFood (String favoriteFood) {
		// get method 2
		System.out.println("My favorite food is " + favoriteFood);		// when should i return instead
																		// of print
	}
	
	public String whatIsFavHoliday (String favoriteHoliday) {
		// get method 3
		return "I love the holiday " + favoriteHoliday;					// when should i return instead
																		// of print
	}
	
	// im getting confused how to set methods i think
	
	public boolean isChristmasFavHoliday (String favoriteHoliday) {
		// method that returns a boolean
		if (favoriteHoliday == "Christmas") {
			return true;
		} else {
			return false;
		}
	
	}
	
	public String thisIsFavFood (String favoriteFood) {
		// method that returns a string
		return "I could have " + favoriteFood + "every single day!";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whatIsFavSong("Twinkle Twinkle Little Star");					// got stuck on static 
		whatIsFavFood("Tamales");
		whatIsFavHoliday("Christmas");
		
		// insert set methods here 
		
		isChristmasFavHoliday();										// fix these 2 once you
																		// understand set methods
		thisIsFavFood();
		
		
		
	}

}
