package payment;

import delivery.Delivery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy payment;

    @BeforeEach
    void setUp() {
        payment = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("Pay with PayPal: 203.0", payment.pay(203.0));
        assertEquals(payment.getClass().getInterfaces()[0], Payment.class);
    }
}
