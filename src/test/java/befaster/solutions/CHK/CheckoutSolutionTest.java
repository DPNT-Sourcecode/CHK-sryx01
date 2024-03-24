package befaster.solutions.CHK;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutSolutionTest {

    private CheckoutSolution checkout;

    @BeforeEach
    public void setUp() {
        checkout = new CheckoutSolution();
    }

    @Test
    public void compute_sum() {
        //assertEquals(checkout.checkout("AAABBCDDBAADDBB"), 430);
        assertEquals(checkout.checkout("AAA"), 130);
        assertEquals(checkout.checkout("AA"), 100);
        assertEquals(checkout.checkout("BB"), 45);
        assertEquals(checkout.checkout("BBB"), 75);


    }
}



