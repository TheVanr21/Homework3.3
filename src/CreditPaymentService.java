public class CreditPaymentService {

    public int calculate(int sum, double percent, int period) {
        int payment;
        percent = percent / (12 * 100);
        period = period * 12;
        payment = (int) Math.round(sum * (percent * Math.pow((1 + percent), period)) / (Math.pow((1 + percent), period) - 1));
        return payment;
    }

    public void print(int sum, double percent, int period, int payment) {
        System.out.println();
        System.out.println("Сумма кредита: " + sum + "₽");
        System.out.println("Процентная ставка: " + percent + "%");
        if (period > 9 && period < 20) {
            System.out.println("Период: " + period + " лет");
        } else {
            int p = period % 10;
            if (p == 1) {
                System.out.println("Период: " + period + " год");
            } else if (p > 1 && p < 5) {
                System.out.println("Период: " + period + " года");
            } else {
                System.out.println("Период: " + period + " лет");
            }
        }
        System.out.println("Ежемесячный платёж: " + payment + "₽");
    }
}
