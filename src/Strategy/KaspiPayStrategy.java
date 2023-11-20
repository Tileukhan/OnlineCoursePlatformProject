package Strategy;

public class KaspiPayStrategy implements PaymentStrategy{
    private String cardnumber;
    public KaspiPayStrategy(String cardnumber)
    {
        this.cardnumber = cardnumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Kaspi Pay " + cardnumber);
    }
}
