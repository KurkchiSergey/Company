package deal;

public class Expenditure extends Deal{
    public Expenditure(String productName, int price) {
        super("Продажа" + productName + "на" + price + "руб",price, 0);
    }
}
