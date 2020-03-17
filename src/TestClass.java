
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Before
    public void setup() {
        Book mobyDick = new Book("Moby Dick", 1851, 15.20);
        Book maxwellSim = new Book("The Terrible Privacy of Maxwell Sim", 2010, 13.14);
        Book woodPecker = new Book("Still Life With Woodpecker", 1980, 11.05);
        Book sleepingMurder = new Book("Sleeping Murder", 1976, 10.24);
        Book menInABoat = new Book("Three Men in a Boat", 1889, 12.87);
        Book theTimeMachine = new Book("The Time Machine", 1895, 10.43);
        Book cavesOfSteal = new Book("The Caves of Steal", 1954, 8.12);
        Book idleFellow = new Book("Idle Thoughts of an Idle Fellow", 1886, 7.32);
        Book christmasCarol = new Book("A Christmas Carol", 1843, 4.23);
        Book taleOfTwoCities = new Book("A Tale of Two Cities", 1859, 6.32);
        Book greatExpectations = new Book("Great Expectations", 1861, 13.21);
    }

    @Test
    public void testOver30() {
        Book woodPecker = new Book("Still Life With Woodpecker", 1980, 11.05);
        Book menInABoat = new Book("Three Men in a Boat", 1889, 12.87);
        Book greatExpectations = new Book("Great Expectations", 1861, 13.21);



        ArrayList<BookDiscount> bookDiscountList = new ArrayList<>();
        Over2000BookDiscount over2000Discount = new Over2000BookDiscount();
        bookDiscountList.add(over2000Discount);

        ArrayList<BasketDiscount> basketDiscountList = new ArrayList<>();
        TotalDiscounts over30Discount = new TotalDiscounts();
        basketDiscountList.add(over30Discount);

        ShoppingBasket basket1 = new ShoppingBasket(bookDiscountList, basketDiscountList);


        basket1.addToBasket(woodPecker);
        basket1.addToBasket(menInABoat);
        basket1.addToBasket(greatExpectations);

        assertEquals(35.27, basket1.basketCost(), 0.1);
    }

    @Test
    public void testUnder30() {
        Book maxwellSim = new Book("The Terrible Privacy of Maxwell Sim", 2010, 13.14);
        Book menInABoat = new Book("Three Men in a Boat", 1889, 12.87);




        ArrayList<BookDiscount> bookDiscountList = new ArrayList<>();
        Over2000BookDiscount over2000Discount = new Over2000BookDiscount();
        bookDiscountList.add(over2000Discount);

        ArrayList<BasketDiscount> basketDiscountList = new ArrayList<>();
        TotalDiscounts over30Discount = new TotalDiscounts();
        basketDiscountList.add(over30Discount);

        ShoppingBasket basket1 = new ShoppingBasket(bookDiscountList, basketDiscountList);


        basket1.addToBasket(maxwellSim);
        basket1.addToBasket(menInABoat);


        assertEquals(24.69, basket1.basketCost(), 0.1);
    }

    @Test
    public void testAllBefore2000() {
        Book sleepingMurder = new Book("Sleeping Murder", 1976, 10.24);
        Book menInABoat = new Book("Three Men in a Boat", 1889, 12.87);
        Book theTimeMachine = new Book("The Time Machine", 1895, 10.43);
        Book cavesOfSteal = new Book("The Caves of Steal", 1954, 8.12);
        Book idleFellow = new Book("Idle Thoughts of an Idle Fellow", 1886, 7.32);
        Book christmasCarol = new Book("A Christmas Carol", 1843, 4.23);
        Book taleOfTwoCities = new Book("A Tale of Two Cities", 1859, 6.32);
        Book greatExpectations = new Book("Great Expectations", 1861, 13.21);




        ArrayList<BookDiscount> bookDiscountList = new ArrayList<>();
        Over2000BookDiscount over2000Discount = new Over2000BookDiscount();
        bookDiscountList.add(over2000Discount);

        ArrayList<BasketDiscount> basketDiscountList = new ArrayList<>();
        TotalDiscounts over30Discount = new TotalDiscounts();
        basketDiscountList.add(over30Discount);

        ShoppingBasket basket1 = new ShoppingBasket(bookDiscountList, basketDiscountList);

        basket1.addToBasket(menInABoat);
        basket1.addToBasket(sleepingMurder);
        basket1.addToBasket(theTimeMachine);
        basket1.addToBasket(cavesOfSteal);
        basket1.addToBasket(idleFellow);
        basket1.addToBasket(christmasCarol);
        basket1.addToBasket(taleOfTwoCities);
        basket1.addToBasket(greatExpectations);


        assertEquals(69.01, basket1.basketCost(), 0.1);
    }

}
