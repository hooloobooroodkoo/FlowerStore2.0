package payment;

import delivery.Delivery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy payment;

    @BeforeEach
    void setUp() {
        payment = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("Pay with credit card: 203.0", payment.pay(203.0));
        assertEquals(payment.getClass().getInterfaces()[0], Payment.class);
    }
}