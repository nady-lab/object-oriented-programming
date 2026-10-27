/*
 * Nadyla da Cunha Barbosa
 * OOP - CMPU2016
 * lab 2
 * */
package lab2;

public class LibraryMember {

		// attributes list
		String firstName;
		String surname;
		int memberNumber;
		String email;
		String membershipType;
		
	    // Constructor with three parameters
	    public LibraryMember(String firstName, String surname, int memberNumber) {
	        this.firstName = firstName;
	        this.surname = surname;
	        this.memberNumber = memberNumber;
	    }
	    
		// constructor with 5 parameters
		public LibraryMember(String firstName, String surname, int memberNumber, String email, String membershipType) {
	        this.firstName = firstName;
	        this.surname = surname;
	        this.memberNumber = memberNumber;
	        this.email = email;
	        this.membershipType = membershipType;
		}
	
		// method 1
		public String displayDetails() {
			return "LibraryMember [firstName=" + firstName + ", surname=" + surname + ", memberNumber=" + memberNumber + " ]";
		}
		
		// method 2
		public String toUpperCase() {
			return firstName.toUpperCase() + " " + surname.toUpperCase();
		}

		
}

