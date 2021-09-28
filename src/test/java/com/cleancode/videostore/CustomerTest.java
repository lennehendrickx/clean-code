package com.cleancode.videostore;

import org.junit.jupiter.api.Test;

import static com.cleancode.videostore.Movie.*;
import static org.assertj.core.api.Assertions.assertThat;


public class CustomerTest {

    @Test
    public void test() {
        var customer = new Customer("John Doe");
        customer.addRental(new Rental(new Movie("Star Wars", NEW_RELEASE), 6));
        customer.addRental(new Rental(new Movie("Peppa Big", CHILDRENS), 7));
        customer.addRental(new Rental(new Movie("Inception", REGULAR), 5));
        
        var expected = "Rental Record for John Doe\n"
                + "	Star Wars	18.0\n"
                + "	Sofia	7.5\n"
                + "	Inception	6.5\n"
                + "Amount owed is 32.0\n"
                + "You earned 4 frequent renter points";
        
        assertThat(customer.print()).isEqualTo(expected);
    }
}
