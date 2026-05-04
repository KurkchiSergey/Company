package taxes;

public class TaxDebit extends TaxSystem {
    private int tax;
    @Override
    public int calcTaxFor(int debit, int credit) {
        tax = debit * 6 / 100;
        if (tax > 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
