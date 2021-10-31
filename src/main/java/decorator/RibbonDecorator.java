package decorator;

import flowerStore.Item;

public class RibbonDecorator extends ItemDecorator{
     public RibbonDecorator(Item item) {
         super(item);
     }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 40;
    }
}
