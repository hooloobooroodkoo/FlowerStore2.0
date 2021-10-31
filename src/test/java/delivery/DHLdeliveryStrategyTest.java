package delivery;


import static org.junit.jupiter.api.Assertions.*;

class DHLdeliveryStrategyTest {
    private  DHLdeliveryStrategy delivery;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        delivery = new DHLdeliveryStrategy();
    }

    @org.junit.jupiter.api.Test
    void deliver() {
        assertEquals(delivery.getClass().getInterfaces()[0], Delivery.class);
    }
}