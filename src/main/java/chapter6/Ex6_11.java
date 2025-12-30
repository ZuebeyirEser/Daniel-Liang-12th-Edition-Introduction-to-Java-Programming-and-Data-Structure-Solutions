package Chapter6;

public class Ex6_11 {
    public static double computeCommission(double salesAmount) {
        double commission = 0;

        if (salesAmount >= 0.01) {
            commission += Math.min(5000, salesAmount) * 0.08;
        }
        if (salesAmount >= 5000.01) {
            commission += Math.min(5000, salesAmount - 5000) * 0.10;
        }
        if (salesAmount >= 10000.01) {
            commission += (salesAmount - 10000) * 0.12;
        }

        return commission;
    }

    public static void main(String[] args) {
        System.out.println("Sales Amount    Commission");
        System.out.println("-----------------------------");

        for (int salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
            double commission = computeCommission(salesAmount);
            System.out.printf("%-15d %.1f%n", salesAmount, commission);
        }
    }
}