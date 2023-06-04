
import java.util.Iterator;
import java.util.List;

// Класс автомата горячих напитков

public class VendingMachineHotDrinks implements Iterable<HotDrinks> {
    private List<HotDrinks> listVendingMachineHotDrinks;

    public List<HotDrinks> getListVendingMachineHotDrinks() {
        return listVendingMachineHotDrinks;
    }

    public void setListVendingMachineHotDrinks(List<HotDrinks> listVendingMachineHotDrinks) {
        this.listVendingMachineHotDrinks = listVendingMachineHotDrinks;
    }

    @Override
    public Iterator<HotDrinks> iterator() {

        return new VendingMachineHotDrinksIterator(listVendingMachineHotDrinks);
    }

}
