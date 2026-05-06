package taxes;
//УСН доходы — налог 6% от доходов;
public class TaxDebit extends TaxSystem {
    private int tax;

    @Override
    public int calcTaxFor(int debit, int credit) {
        tax = debit * 6 / 100;
        if (tax >= 0) {
            return Math.abs(tax);
        } else {
            return 0;
        }
    }
}
