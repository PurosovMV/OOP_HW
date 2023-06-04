import java.util.*;

public class Main {
    public static void main(String[] args) {

        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        vmHotDrinks.setListVendingMachineHotDrinks(Arrays.asList(
                new HotDrinks("Coffee", 3L, 0.3, 90),
                new HotDrinks("Tea", 1L, 0.4, 80),
                new HotDrinks("Milk", 2L, 1.0, 0)));

        System.out.println("---------ГОРЯЧИЕ НАПИТКОВ ---------");
        Iterator<HotDrinks> iter = vmHotDrinks.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("---------СОРТИРОВКА ПО ЦЕНЕ ГОРЯЧИХ НАПИТКОВ ---------");
        vmHotDrinks.getListVendingMachineHotDrinks().sort(new ComparableOfPriceHotDrinks());
        for (HotDrinks hotDrinks : vmHotDrinks) {
            System.out.println(hotDrinks);
        }
    }
}
