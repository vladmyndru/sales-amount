package app;

public class Main {
    static String productName;
    static int num;
    static double totalSales;
    static int days;
    static double salesForDay;
    private final static String CURRENCY = "EUR";
    public static void main (String [] args){
        // product 1
        productName = "smartphone";
        num = 1;
        days = 5;
        totalSales = 12153.41;
        salesForDay = totalSales/days;
        System.out.printf("Product No %d: %s, %ntotal sales " +
                        "for %d days is %s %.2f, %nsales by day is %s %.2f.",
                num, productName, days, CURRENCY, totalSales, CURRENCY, salesForDay);

        // product 2
        productName = "laptop";
        num = 2;
        days = 7;
        totalSales = 10486.85;
        salesForDay = totalSales/days;
        System.out.printf("%nProduct No %d: %s, %ntotal sales " +
                        "for %d days is %s %.2f, %nsales by day is %s %.2f.",
                num, productName, days, CURRENCY, totalSales, CURRENCY, salesForDay);
    }
}
