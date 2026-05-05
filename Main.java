import taxes.TaxDebit;
import taxes.TaxDebitMinusCredit;


public class Main {
    public static void main(String[] args) {
        Company kurkchi = new Company(" ИП Куркчи С.Г.", 0, 0, new TaxDebit());
        kurkchi.shiftMoney(100000);
        kurkchi.shiftMoney(-20000);
        kurkchi.payTaxes();
        //смена системы
        kurkchi.setTaxSystem(new TaxDebitMinusCredit());
        kurkchi.shiftMoney(70000);
        kurkchi.shiftMoney(-90000);
        kurkchi.payTaxes();

    }
}
