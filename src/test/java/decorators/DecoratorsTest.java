package decorators;
import decorator.BusketDecorator;
import decorator.PaperDecorator;
import decorator.RibbonDecorator;
import delivery.PostDeliveryStrategy;
import flowerStore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DecoratorsTest {
    private Order order;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        order = new Order();
        Item cactus1 = new Flower();
        cactus1.setPrice(55.50);
        Item cactus2 = new Flower();
        cactus2.setPrice(55.50);
        Item romashka = new Flower();
        romashka.setPrice(20.00);
        order.addItem(cactus1);
        order.addItem(cactus2);
        order.addItem(romashka);

    }
    @org.junit.jupiter.api.Test
    void totalPrice() {
        assertEquals(131.0, order.calculateTotalPrice());
    }

    @org.junit.jupiter.api.Test
    void busketDecorator() {
        Item flower = new Flower();
        BusketDecorator busket = new BusketDecorator(flower);
        order.addItem(busket);
        assertEquals(135.0, order.calculateTotalPrice());
    }

    @org.junit.jupiter.api.Test
    void paperDecorator() {
        Item flower = new Flower();
        PaperDecorator paper = new PaperDecorator(flower);
        order.addItem(paper);
        assertEquals(144.0, order.calculateTotalPrice());
    }

    @org.junit.jupiter.api.Test
    void ribbonDecorator() {
        Item flower = new Flower();
        RibbonDecorator ribbon = new RibbonDecorator(flower);
        order.addItem(ribbon);
        assertEquals(171.0, order.calculateTotalPrice());
    }

    @org.junit.jupiter.api.Test
    void ribbonPaperAndBusketDecorator() {
        Item flower = new Flower();
        RibbonDecorator ribbon = new RibbonDecorator(flower);
        PaperDecorator paper = new PaperDecorator(ribbon);
        BusketDecorator busket = new BusketDecorator(paper);
        order.addItem(busket);
        assertEquals(188.0, order.calculateTotalPrice());
    }

}
