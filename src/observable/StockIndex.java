package observable;

import java.util.ArrayList;
import java.util.List;

/**
 * A simplified version of a stock index. The index is calculated by observing
 * one or more stocks and taking the sum of their value. If the value of
 * a stock increases or decreases the index must be updated.
 * @author estensen
 *
 */
public class StockIndex implements StockListener {
	
	@SuppressWarnings("unused")
	private String name;
	private double index;
	private List<Stock> indexList = new ArrayList<>();
	
	/**
	 * Constructs a stock index with a name and zero, one or more stocks
	 * @param name the name of the stock
	 * @param stock zero, one or more stocks
	 */
	public StockIndex(String name, Stock... stock) {
		this.name = name;
		index = 0;		
		for (int i = 0; i < stock.length; i++) {
			addStock(stock[i]);
		}
	}
	
	/**
	 * Adds a stock object to the index
	 * @param stock
	 */
	public void addStock(Stock stock) {
		if (indexList.contains(stock)) {
			
		}
		else {			
		indexList.add(stock);
		index += stock.getPrice();
		stock.addStockListener(this);
		}
	}
	
	/**
	 * Removes a stock object from the index
	 * @param stock
	 */
	public void removeStock(Stock stock) {
		if (indexList.contains(stock)) {
			indexList.remove(stock);
			index -= stock.getPrice();
			stock.removeStockListener(this);
		}
	}
	
	/**
	 * Gets the value of the index
	 * @return index
	 */
	public double getIndex() {
		return index;
	}
	
	/**
	 * Keeps the listener updated on the stock price
	 * @param stock stock object
	 * @param oldPrice the old price of the stock
	 * @param newPrice the new price of the stock
	 */
	@Override
	public void stockPriceChanged(Stock stock, double oldPrice, double newPrice) {
		index = index - oldPrice + newPrice;
	}
}
