import deal.Deal;
import deal.Expenditure;
import deal.Sale;
import taxes.TaxDebit;
import taxes.TaxDebitMinusCredit;


public class Main {
    public static void main(String[] args) {
        Company kurkchi = new Company(" ИП Куркчи С.Г.", 0, 0, new TaxDebit());
        /* kurkchi.shiftMoney(100000);
        kurkchi.shiftMoney(-20000);
        kurkchi.payTaxes();
        //смена системы
        kurkchi.setTaxSystem(new TaxDebitMinusCredit());
        kurkchi.shiftMoney(70000);
        kurkchi.shiftMoney(-90000);
        kurkchi.payTaxes();*/
        Deal[] deals = {new Sale("Ремонт токарного станка", 150000),
                new Expenditure("Покупка инструмента", 20000)};
        //прибыль до выплаты налога

        int profit = kurkchi.applyDeals(deals);
      
        System.out.printf("Прибыль до выплаты налога %d руб.", profit);
        kurkchi.setTaxSystem(new TaxDebitMinusCredit());
        System.out.println();
        int newProfit = kurkchi.applyDeals(deals);
        System.out.printf("Прибыль до выплаты налога %d руб.", newProfit);

    }
}
