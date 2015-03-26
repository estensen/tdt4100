package inheritance;

public class CargoCar extends TrainCar {

	private int cargoWeight;
	
	/**
	 * Constructs a cargo car that inherits from TrainCar
	 * @param deadWeight
	 * @param cargoWeight
	 */
	public CargoCar(int deadWeight, int cargoWeight) {
		super(deadWeight);
		this.cargoWeight = cargoWeight;
	}
	
	/**
	 * Gets the cargo weight
	 * @return 
	 */
	public int getCargoWeight() {
		return cargoWeight;
	}
	
	/**
	 * Sets the cargo weight
	 */
	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}
	
	@Override
	public int getTotalWeight() {
		return getDeadWeight() + cargoWeight;
	}
	

}
