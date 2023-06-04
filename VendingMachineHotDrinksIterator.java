import java.util.*;

public class VendingMachineHotDrinksIterator implements Iterator<HotDrinks> {
    private List<HotDrinks> listOfVendingMachineHotDrinksIterable;
    private static int count;

    public VendingMachineHotDrinksIterator(List<HotDrinks> listOfVendingMachineHotDrinksIterable) {
        this.listOfVendingMachineHotDrinksIterable = listOfVendingMachineHotDrinksIterable;
        count = 0;
    }

    public static void setCount(int count) {
        VendingMachineHotDrinksIterator.count = count;
    }

    @Override
    public boolean hasNext() {
        return count < listOfVendingMachineHotDrinksIterable.size();
    }

    @Override
    public HotDrinks next() {
        return listOfVendingMachineHotDrinksIterable.get(count++);
    }

}
