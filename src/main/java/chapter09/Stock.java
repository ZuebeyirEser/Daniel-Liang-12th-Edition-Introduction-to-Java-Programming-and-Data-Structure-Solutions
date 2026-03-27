package chapter09;

public class Stock {
  private String symbol;
  private String name;
  private double previousClosingPrice;
  private double currentPrice;

  public Stock(String name, String symbol) {
    this.name = name;
    this.symbol = symbol;
  }
  public double getChangePercent() {
    return ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
  }

  // getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public double getPreviousClosingPrice() {
    return previousClosingPrice;
  }

  public void setPreviousClosingPrice(double previousClosingPrice) {
    this.previousClosingPrice = previousClosingPrice;
  }

  public double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }
}
