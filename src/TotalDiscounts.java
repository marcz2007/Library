public class TotalDiscounts implements BasketDiscount {

    @Override
    public double applyDiscount(double price) {
        if (price > 30){
            return price * 0.95;
        }
        else{
            return price;
        }

    }
}
