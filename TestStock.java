package t1;

class Stock {
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String newSymbol, String newName, double newPreciousClosingPrice, double newCurrentPrice) {
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newPreciousClosingPrice;
		currentPrice = newCurrentPrice;
	}
	
	public double getChangePercent() {
		return (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
	}
	
}

public class TestStock {
	public static void main(String[] args) {
	Stock myStock = new Stock("ORCL", "OracleCorporation", 34.5, 34.35);
	System.out.println("price-change percentage is " + myStock.getChangePercent());
	}
}
