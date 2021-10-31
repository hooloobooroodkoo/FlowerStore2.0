package flowerStore;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerBucket extends Item{
    List<FlowerPack> flowerpacks = new ArrayList<FlowerPack>();



    public double getPrice() {
        int sum = 0;
        for (int i=0; i< flowerpacks.size(); i++) {
            sum += flowerpacks.get(i).getPrice();
        }
        return sum;
    }

    public String getDescription() {
        return null;
    }
    public void addFlower(FlowerPack flowers) {
        flowerpacks.add(flowers);
    }
}