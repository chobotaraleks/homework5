package app;

public class Main {

    public static void main(String[] args) {
        double income = 30000; // Задам суму доходу безпосередньо
        double tax = calculateTax(income);

        System.out.printf("Дохід: %.2f грн%n", income);
        System.out.printf("Сума податку: %.2f грн%n", tax);
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 10000) {
            tax = income * 0.025;
        } else if (income <= 25000) {
            tax = 10000 * 0.025 + (income - 10000) * 0.043;
        } else {
            tax = 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067;
        }

        return tax;
    }
}
