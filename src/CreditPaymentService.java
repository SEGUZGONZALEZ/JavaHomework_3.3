public class CreditPaymentService {

    public int calculate(int loanAmount, double interestRate, int loanPeriod) {
        double interestRateMonth = interestRate / (100*12);
        double degrading = Math.pow((1+interestRateMonth), -loanPeriod);

        return (int) (loanAmount * interestRateMonth / (1 - degrading));

    }
}