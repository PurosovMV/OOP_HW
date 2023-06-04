import java.util.Comparator;

public class ComparableOfPriceHotDrinks implements Comparator<HotDrinks> {

    @Override

   
    public int compare(HotDrinks o1, HotDrinks o2) {

        return Long.valueOf(o1.getPrice()).compareTo(Long.valueOf(o2.getPrice()));
    }
}
