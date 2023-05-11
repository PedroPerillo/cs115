package week05;

import week04.DessertItem;

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

}
