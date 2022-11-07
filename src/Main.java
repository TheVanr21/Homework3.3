public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        double percent = 9.99;
        int period1 = 1;
        int period2 = 2;
        int period3 = 3;

        int payment1 = service.calculate(sum, percent, period1);
        service.print(sum, percent, period1, payment1);

        int payment2 = service.calculate(sum, percent, period2);
        service.print(sum, percent, period2, payment2);

        int payment3 = service.calculate(sum, percent, period3);
        service.print(sum, percent, period3, payment3);
    }
}