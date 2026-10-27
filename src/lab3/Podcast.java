/*
 * Nadyla da Cunha Barbosa
 * OOP - CMPU2016
 * lab 3
 * */
package lab3;

public class Podcast {
	
	// declare attributes
	private String title;
	private String category;
	private int durationMinutes;
	
	// constructor that sets all three attributes
	public Podcast(String title, String category, int durationMinutes) {
		setTitle(title);
		setCategory(category);
		setDurationMinutes(durationMinutes);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		String s = title.trim();
		if (s.isEmpty()) {
			System.out.println("ERROR - TITLE IS EMPTY");
		} else {
			this.title = s;
		}
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getDurationMinutes() {
		return durationMinutes;
	}

	public void setDurationMinutes(int durationMinutes) {
		if (durationMinutes >= 5 && durationMinutes <= 180) {
			this.durationMinutes = durationMinutes;
		} else {
			System.out.println("ERROR - DURATION IS TOO LOW/TOO HIGH");
		}
			
	}
	
	public void playPreview()
	{
		if (category.equalsIgnoreCase("Technology")) {
			System.out.println("Your technology update is ready.");
		} else if (category.equalsIgnoreCase("Comedy")) {
			System.out.println("Get ready for a laugh.");
		} else {
			System.out.println("Your podcast preview is ready.");
		}
	}
	
	@Override
	public String toString() {
		return title + " is a " + category + " episode lasting " + durationMinutes + " minutes.";
	}
}
