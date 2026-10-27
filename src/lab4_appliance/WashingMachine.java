/*
 * Nadyla da Cunha Barbosa
 * OOP - CMPU2016
 * lab 4_appliance
 * */
package lab4_appliance;

public class WashingMachine extends Appliance {
	
	// attributes list
	private int powerWatts;
	
	// methods
	public void startWash() {
		System.out.println("The washing machine has started washing.");
	}
	
	public void stopWash() {
		System.out.println("The washing machine has stopped.");
	}
	
	// getters and setter for all four fields
	public int getPowerWatts() {
		return powerWatts;
	}

	public void setPowerWatts(int powerWatts) {
		this.powerWatts = powerWatts;
	}
	
	// constructor that receives all four values
	public WashingMachine(String brand, String model, double capacityKg, int powerWatts) {
		super(brand, model, capacityKg);
		setPowerWatts(powerWatts);
	}

	// toString using all four getters
	@Override
	public String toString() {
		return super.toString() + ", powerWatts=" + getPowerWatts() + "]";
	}
	
}
