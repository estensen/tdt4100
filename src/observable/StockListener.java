package observable;

/**
 * Listen interface to keep the listener updated on the stock price
 * @author estensen
 *
 */
public interface StockListener {
	
	/**
	 * Keeps the listener updated on the stock price
	 * @param stock stock object
	 * @param oldPrice the old price of the stock
	 * @param newPrice the new price of the stock
	 */
	public void stockPriceChanged(Stock stock, double oldPrice, double newPrice);
	
}
