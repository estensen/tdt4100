package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Trainset consisting of multiple train cars
 * @author estensen
 *
 */
public class Train {
	
	private List<TrainCar> trainSet = new ArrayList<>();
	/**
	 * Adds a train car to the trainset
	 * @param trainCar
	 */
	public void addTrainCar(TrainCar trainCar) {
		if (!contains(trainCar)) {			
			trainSet.add(trainCar);
		}
	}
	
	/**
	 * Checks if the train car already in the trainset
	 * @param trainCar
	 * @return
	 */
	public boolean contains(TrainCar trainCar) {
		return trainSet.contains(trainCar);
	}
	
	/**
	 * Gets the total weight of the trainset
	 * @return totalWeight
	 */
	public int getTotalWeight() {
		int totalWeight = 0;
		for (TrainCar trainCar : trainSet) {
			totalWeight += trainCar.getTotalWeight();
		}
		return totalWeight;
	}
	
	/**
	 * Gets the total number of passengers
	 * @return passengerCount
	 */
	public int getPassengerCount() {
//		Hvis trainCar er PassengerCar
		int totalPassengerCount = 0;
		for (TrainCar car : trainSet) {
			if (car instanceof PassengerCar) {
				totalPassengerCount += ((PassengerCar)car).getPassengerCount();				
			}
		}
		return totalPassengerCount;
	}
	
	/**
	 * Gets the total cargo weight
	 * @return totalCargoWeight
	 */
	public int getCargoWeight() {
//		Hvis trainCar er CargoCar
		int totalCargoWeight = 0;
		for (TrainCar car : trainSet) {
			if (car instanceof CargoCar) {				
				totalCargoWeight += ((CargoCar)car).getCargoWeight();
			}
		}
		return totalCargoWeight;
	}
	
	/**
	 * Makes a string with information about the trainset
	 * and overview of all the train cars 
	 */
//	public String toString() {
//		 return "";
//	}
	
	
	public static void main(String[] args) {
		Train train = new Train();
		PassengerCar pc = new PassengerCar(2000,200);
		CargoCar cg = new CargoCar(1500,1000);
		train.addTrainCar(pc);
		train.addTrainCar(cg);
		train.addTrainCar(pc);
		
//		for (TrainCar car : train.trainSet) {
//			System.out.println(car);			
//		}
		System.out.println(train.getPassengerCount());
		System.out.println(train.getCargoWeight());
	}
}
