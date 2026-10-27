/*
 * Nadyla da Cunha Barbosa
 * OOP - CMPU2016
 * lab 3
 * */

package lab3;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
	
		Podcast episode1 = new Podcast("Tech Talk", "Technology", 45);
		Podcast episode2 = new Podcast("Laugh Out Loud", "Comedy", 30);
		Podcast episode3 = new Podcast("History Hour", "History", 60);

		episode1.setTitle("  Tech Talk   ");
		episode1.setCategory("Technology");
		episode1.setDurationMinutes(4);
		
		episode2.setCategory("cOmEdY");
		
		episode1.getTitle();
		episode1.getCategory();
		episode1.getDurationMinutes();
		
		episode1.playPreview();
		episode2.playPreview();
		episode3.playPreview();
		
		System.out.println(episode1.toString());
		
		/////////////////////////////////////////////////////////////
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the episode title: ");
		String title = input.nextLine();
		System.out.print("Enter the category: ");
		String category = input.nextLine();
		System.out.print("Enter the duration in minutes: ");
		int duration = input.nextInt();
		
		// Add your object creation and printing code here.
		Podcast newEpisode = new Podcast(title, category, duration);
		
		System.out.println(newEpisode.toString());

		input.close();

	}

}
