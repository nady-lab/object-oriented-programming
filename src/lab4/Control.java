/*
 * Nadyla da Cunha Barbosa
 * OOP - CMPU2016
 * lab 4
 * */
package lab4;

public class Control {

	public static void main(String[] args) {
		
		// test washing machine
		WashingMachine wm = new WashingMachine("Bosch", "EcoClean", 7.0, 1800);
		wm.startWash();
		wm.stopWash();
		System.out.println(wm);
		wm.setBrand("");
		System.out.println(wm.getBrand()); // should still print Bosch
		
		System.out.println("\n");
		
		// test dryer
		Dryer dryer = new Dryer("Samsung", "QuickDry", 8.0, true);
		dryer.startDry();
		dryer.stopDry();
		System.out.println(dryer);
		dryer.setBrand(null);
		System.out.println(dryer.getBrand()); // should still print Samsung
	}

}
