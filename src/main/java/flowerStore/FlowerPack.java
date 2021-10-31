package flowerStore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack extends Item{
    private Flower flower;
    private int amount;
    private double price;

    public void setPrice() {
        this.price = flower.getPrice() * amount;
    }

    public FlowerTypes getFlowerType() {
        return flower.getFlowerType();
    }

    @Override
    public String getDescription() {
        return null;
    }
}
