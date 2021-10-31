package delivery;

import flowerStore.Item;

import java.util.List;

public class DHLdeliveryStrategy implements Delivery{
    @Override
    public void deliver(List<Item> items) {
        System.out.println("The items will be delivered with DHL");
    }
}
