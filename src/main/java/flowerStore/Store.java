package flowerStore;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Store {
    List<Flower> cactus = new ArrayList<Flower>();
    List<Flower> romashka = new ArrayList<Flower>();
    Hashtable<String, Double> prices = new Hashtable<String, Double>();


    public void getFlower(Flower flower) {
        if (flower.getFlowerType().toString().equals("ROMASHKA")) {
            romashka.add(flower);

        }
        if (flower.getFlowerType().toString().equals("CACTUS")) {
            cactus.add(flower);
        }
        prices.put(flower.getFlowerType().toString(), flower.getPrice());
    }

    public String search(String flowerType) {
        if (flowerType.equals("ROMASHKA")) {
            return "Number of romashkas: " + romashka.size() +"\nPrice: " + prices.get(flowerType);
        }
        else {
            return "Number of cactuses: " + cactus.size() +"\nPrice: " + prices.get(flowerType);
        }
    }


}