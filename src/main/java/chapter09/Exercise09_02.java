package chapter09;

public class Exercise09_02 {
  public static void main(String[] args) {
    Stock oracleStock = new Stock("Oracle Coorparation", "ORCL");
    oracleStock.setPreviousClosingPrice(34.5);
    oracleStock.setCurrentPrice(34.35);

    System.out.println("Price change of " + oracleStock.getName() + " is: " + oracleStock.getChangePercent() + " %");
  }
}
