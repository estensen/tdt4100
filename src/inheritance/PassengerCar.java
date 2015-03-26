package inheritance;

public class PassengerCar extends TrainCar {

	private int passengerCount;
	private int averagePersonWeight = 80;
	
	/**
	 * Constructs 
	 * @param deadWeight
	 * @param passengers
	 */
	public PassengerCar(int deadWeight, int passengers) {
		super(deadWeight);
		this.passengerCount = passengers;
	}

	/**
	 * Gets the number of passengers
	 * @return passengers number of passengers in the train car
	 */
	public int getPassengerCount() {
		return passengerCount;
	}

	/**
	 * Sets the number of passengers
	 * @param passengers number of passengers in the train car
	 */
	public void setPassengerCount(int passengers) {
		this.passengerCount = passengers;
	}
	
	@Override
	public int getTotalWeight() {
		return getDeadWeight() + passengerCount * averagePersonWeight;
	}

}
