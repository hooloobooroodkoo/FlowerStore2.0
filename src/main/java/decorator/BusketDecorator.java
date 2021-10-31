package decorator;

import flowerStore.Item;

public class BusketDecorator extends ItemDecorator {
    public BusketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}