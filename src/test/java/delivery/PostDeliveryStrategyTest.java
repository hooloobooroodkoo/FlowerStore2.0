package delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    private PostDeliveryStrategy delivery;

    @BeforeEach
    void setUp() {
        delivery = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        assertEquals(delivery.getClass().getInterfaces()[0], Delivery.class);
    }
}