package Strategy;

public class HalykPayStrategy implements PaymentStrategy{
    private String cardnumber;
    public HalykPayStrategy(String cardnumber)
    {
        this.cardnumber = cardnumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Halyk Pay " + cardnumber);
    }
}
