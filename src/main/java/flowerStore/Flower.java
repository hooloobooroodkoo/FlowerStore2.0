package flowerStore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter @Setter @ToString
public class Flower extends Item{
    private double sepalLength;
    private double price;
    private FlowerTypes flowerType;


    @Override
    public String getDescription() {
        return null;
    }
}

