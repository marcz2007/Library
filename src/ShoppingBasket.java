import java.util.ArrayList;

public class ShoppingBasket {

    private ArrayList<Book> books;
    private ArrayList<BookDiscount> bookDiscounts;
    private ArrayList<BasketDiscount> basketDiscounts;

    public ShoppingBasket(ArrayList<BookDiscount> bookDiscounts, ArrayList<BasketDiscount> basketDiscounts ) {
        books = new ArrayList<>();
        this.bookDiscounts = bookDiscounts;
        this.basketDiscounts = basketDiscounts;

    }


    public void addToBasket(Book book) {

        books.add(book);

    }

    public double basketCost() {

        double total = 0.00;
        for (int i = 0; i < books.size(); i++) {
            Book currentBook = books.get(i);
            double currentPrice = currentBook.getPrice();

            for (int j = 0; j < bookDiscounts.size(); j++) {
               currentPrice = bookDiscounts.get(j).applyDiscount(currentBook, currentPrice);

            }
            total += currentPrice;
        }
        for (int a = 0; a < basketDiscounts.size(); a++){
            total = basketDiscounts.get(a).applyDiscount(total);
        }


        return Math.round(total * 100.0 )/ 100.0;
    }


}
