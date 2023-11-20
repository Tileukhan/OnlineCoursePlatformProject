package Strategy;

public class QiwiPayStrategy implements PaymentStrategy{
    private String cardnumber;
    public QiwiPayStrategy(String cardnumber)
    {
        this.cardnumber = cardnumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Qiwi Pay " + cardnumber);
    }
}
