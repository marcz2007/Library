public class Over2000BookDiscount implements BookDiscount {


    @Override
    public double applyDiscount(Book book, double currentPrice) {

        if (book.getYear() > 2000) {
            return currentPrice * 0.90;
        } else {
            return currentPrice;
        }
    }
}
