public class Company {
    String title;
    int debit = 0;
    int credit = 0;

    public Company(String title, int debit, int credit) {
        this.title = title;
        this.debit = debit;
        this.credit = credit;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);

        } else {
            //ничего не делаем
        }
    }
}
