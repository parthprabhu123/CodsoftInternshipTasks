import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");
        System.out.println("Available currencies for conversion:");
        System.out.println("1. Indian Rupees (INR)");
        System.out.println("2. US Dollars (USD)");
        System.out.println("3. British Pounds (GBP)");
        System.out.print("Enter the currency you want to convert from (e.g., INR, USD, GBP): ");
        String fromCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the currency you want to convert to (e.g., INR, USD, GBP): ");
        String toCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

        System.out.println(amount + " " + fromCurrency + " is equivalent to " + convertedAmount + " " + toCurrency);

        scanner.close();
    }

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double conversionRate;

        // Conversion rates as of my knowledge cutoff date (September 2021)
        if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            conversionRate = 0.014; // 1 INR to USD
        } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            conversionRate = 73.36; // 1 USD to INR
        } else if (fromCurrency.equals("INR") && toCurrency.equals("GBP")) {
            conversionRate = 0.010; // 1 INR to GBP
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("INR")) {
            conversionRate = 102.10; // 1 GBP to INR
        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            conversionRate = 0.721; // 1 USD to GBP
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            conversionRate = 1.39; // 1 GBP to USD
        } else if (fromCurrency.equals(toCurrency)) {
            return amount; // Same currency, no conversion needed
        } else {
            System.out.println("Unsupported currency conversion.");
            System.exit(1);
            return 0; // Exit program if an unsupported conversion is attempted
        }

        return amount * conversionRate;
    }
}
