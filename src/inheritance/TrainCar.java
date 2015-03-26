package inheritance;

/**
 * The simplest for of train car
 * @author estensen
 *
 */

public class TrainCar {

	private int deadWeight;
	
	/**
	 * Constructs a train car
	 * @param deadWeight sets the weight of an empty train car
	 */
	public TrainCar(int deadWeight) {
		this.deadWeight = deadWeight;
	}
	
	/**
	 * Gets the weight of the train car with contents
	 * @return totalWeight the train car with contents
	 */
	public int getTotalWeight() {
		return getDeadWeight();
	}
	
	/**
	 * Sets the weight of the empty train car
	 * @param deadWeight the weight of the train car
	 */
	public void setDeadWeight(int deadWeight) {
		this.deadWeight = deadWeight;
	}
	
	/**
	 * Gets the weight of the empty train car
	 * @return deadWeight the weight of the train car
	 */
	public int getDeadWeight() {
		return deadWeight;
	}
}
