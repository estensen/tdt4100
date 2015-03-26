package observable;

import java.util.ArrayList;
import java.util.List;

/**
 * A stock that has a ticker and a value that can change
 * @author estensen
 *
 */
public class Stock {
	
	private String ticker;
	private double price;
	private List<StockListener> stockListenersList = new ArrayList<>();

	/**
	 * Constructs a stock with a given ticker and stock value
	 * @param ticker the stock code
	 * @param price the price of the stock 
	 */
	public Stock(String ticker, double price) {
		this.ticker = ticker;
		this.price = price;
	}
	
	/*
	 * Gets the stock price
	 * @return the price of the stock
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Sets a new stock value. Fails if price is negative.
	 * Notifies the listeners if the stock price changes
	 * @param newPrice the new stock price
	 */
	public void setPrice(double price) {
//		IllegalArgumentException if negative or zero
		if (price <= 0) {
			throw new IllegalArgumentException("The stock price has to be positive");
		}
		else {
			double oldPrice = this.price;
			double newPrice = price;
			this.price = newPrice;
			for (StockListener s : stockListenersList) {
				s.stockPriceChanged(this, oldPrice, newPrice);
			}
		}
	}
	
	/**
	 * Gets the ticker of the stock
	 * @return the ticker of the stock
	 */
	public String getTicker() {
		return ticker;
	}
	
	/**
	 * Adds a new observer of the stock to a list
	 * @param StockListener listener of the stock
	 */
	public void addStockListener(StockListener stockListener) {
		this.stockListenersList.add(stockListener);
	}
	
	/**
	 * @param StockListener listener of the stock
	 * Removes an observer of the stock from a list 
	 */
	public void removeStockListener(StockListener stockListener) {		
		this.stockListenersList.remove(stockListener);
	}
}
