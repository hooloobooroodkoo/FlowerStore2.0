package flowerStore;
import delivery.Delivery;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;

import java.util.ArrayList;
@Getter @Setter
public class Order {
    private ArrayList<Item> items = new ArrayList<Item>();
    private Payment payment;
    private Delivery delivery;
    public Order() {
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(FlowerBucket bucket){
        items.remove(bucket);
    }
    public double calculateTotalPrice(){
        double sum = 0;
        for (Item item: items) {
            sum += item.getPrice();
        }
        return sum;
    }
    public void setPaymentStrategy(Payment paymentStrategy) {
        payment = paymentStrategy;
    }

    public void setDelivery(Delivery deliveryStrategy) {
        delivery = deliveryStrategy;
    }

    public void processOrder() {
        System.out.println("Your order is being processed");
    }

}
