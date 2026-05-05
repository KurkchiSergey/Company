package taxes;
//УСН доходы минус расходы — налог 15% от разницы доходов и расходов.
public class TaxDebitMinusCredit extends TaxSystem{
    private int tax;
    @Override
    public int calcTaxFor(int debit, int credit) {
        tax = (debit - credit) * 15 / 100;
        if (tax >= 0) {
            return Math.abs(tax);
        } else {
            return 0;
        }
    }
}
