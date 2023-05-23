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

    public String toString(){


        String line1 = "-------------------------------Receipt-----------------------------\n";
        String line2 = "";
        String line3 = "-------------------------------------------------------------------\n";
        String line4 = String.format("%-49s%-9d\n", "Total number of items in the order:", this.itemCount());
        String line5 = String.format("%-49s$%-9.2f[Tax: $%.2f]\n","Order Subtotals:",this.orderCost(),this.orderTax());
        String line6 = String.format("%-49s$%-9.2f\n","Order Totals:", this.orderCost()+this.orderTax());
        String line7 = "-------------------------------------------------------------------\n";
        for (DessertItem item : this.order) {
            line2 += item +"\n";
        }

        return line1 + line2 + line3 + line4 + line5 + line6 + line7;
    }
}
