
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double eatAffordablyCost = 2.50;
        if (payment >= eatAffordablyCost) {
            double change = payment - eatAffordablyCost;
            this.money = this.money + eatAffordablyCost;
            affordableMeals++;
            return change;
        }

        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double eatHeartilyCost = 4.30;
        if (payment >= eatHeartilyCost) {
            double change = payment - eatHeartilyCost;
            this.money = this.money + eatHeartilyCost;
            heartyMeals++;
            return change;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double eatAffordablyCost = 2.50;
        if (card.balance() >= eatAffordablyCost) {
            card.takeMoney(eatAffordablyCost);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double eatHeartilyCost = 4.30;
        if (card.balance() >= eatHeartilyCost) {
            card.takeMoney(eatHeartilyCost);
            heartyMeals++;
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if (sum >= 0){
            this.money += sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
