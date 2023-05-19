package dessertShop;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<DessertItem> order;
    public Order(){
        this.order = new ArrayList<DessertItem>();
    }
    public List<DessertItem> getOrderList(){
        return order;
    }
    public void add(DessertItem item){
        order.add(item);
    }
    public int itemCount(){
        return order.size();
    }

    //methods
    public double orderCost(){
        double totalCost = 0;
        for (DessertItem item : order) {
            totalCost += item.calculateCost();
        }
        return totalCost;
    }
    public double orderTax(){
        double totalTax = 0;
        for (DessertItem item : order) {
            totalTax += item.calculateTax();
        }
        return totalTax;
    }

}
