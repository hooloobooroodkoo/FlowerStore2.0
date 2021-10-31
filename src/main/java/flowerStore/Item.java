package flowerStore;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class Item {
    String description;
    double price;
    public abstract double getPrice();
    public abstract String getDescription();
}