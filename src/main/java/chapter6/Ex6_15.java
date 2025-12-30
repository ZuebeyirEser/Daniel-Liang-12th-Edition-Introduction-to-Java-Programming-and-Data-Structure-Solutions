package Chapter6;

public class Ex6_15 {

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Income", "Single", "Married", "Joint", "Head of");

        for (int income = 50000; income <= 60000; income += 50) {
            System.out.printf("%-10d%-10.2f%-10.2f%-10.2f%-10.2f\n",
                    income,
                    computeTax(0, income),   // Single
                    computeTax(1, income),   // Married
                    computeTax(2, income),   // Joint
                    computeTax(3, income));  // Head of household
        }
    }

    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;
        double[] rates = {0.10, 0.12, 0.22, 0.24, 0.32, 0.35, 0.37};

        int[][] brackets = {
                // Single
                {9875, 40125, 85525, 163300, 207350, 518400},
                // Married Filing Jointly
                {19750, 80250, 171050, 326600, 414700, 622050},
                // Married Filing Separately
                {9875, 40125, 85525, 163300, 207350, 311025},
                // Head of Household
                {14100, 53700, 85500, 163300, 207350, 518400}
        };

        int[] thresholds = brackets[status];

        // Calculate tax based on the taxable income and status brackets
        if (taxableIncome <= thresholds[0]) {
            tax = taxableIncome * rates[0];
        } else if (taxableIncome <= thresholds[1]) {
            tax = thresholds[0] * rates[0] + (taxableIncome - thresholds[0]) * rates[1];
        } else if (taxableIncome <= thresholds[2]) {
            tax = thresholds[0] * rates[0] + (thresholds[1] - thresholds[0]) * rates[1] +
                    (taxableIncome - thresholds[1]) * rates[2];
        } else if (taxableIncome <= thresholds[3]) {
            tax = thresholds[0] * rates[0] + (thresholds[1] - thresholds[0]) * rates[1] +
                    (thresholds[2] - thresholds[1]) * rates[2] + (taxableIncome - thresholds[2]) * rates[3];
        } else if (taxableIncome <= thresholds[4]) {
            tax = thresholds[0] * rates[0] + (thresholds[1] - thresholds[0]) * rates[1] +
                    (thresholds[2] - thresholds[1]) * rates[2] + (thresholds[3] - thresholds[2]) * rates[3] +
                    (taxableIncome - thresholds[3]) * rates[4];
        } else if (taxableIncome <= thresholds[5]) {
            tax = thresholds[0] * rates[0] + (thresholds[1] - thresholds[0]) * rates[1] +
                    (thresholds[2] - thresholds[1]) * rates[2] + (thresholds[3] - thresholds[2]) * rates[3] +
                    (thresholds[4] - thresholds[3]) * rates[4] + (taxableIncome - thresholds[4]) * rates[5];
        } else {
            tax = thresholds[0] * rates[0] + (thresholds[1] - thresholds[0]) * rates[1] +
                    (thresholds[2] - thresholds[1]) * rates[2] + (thresholds[3] - thresholds[2]) * rates[3] +
                    (thresholds[4] - thresholds[3]) * rates[4] + (thresholds[5] - thresholds[4]) * rates[5] +
                    (taxableIncome - thresholds[5]) * rates[6];
        }

        return tax;
    }
}
