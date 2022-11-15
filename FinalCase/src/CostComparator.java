import java.util.Comparator;

public class CostComparator implements Comparator<Items> {
    @Override
    public int compare(Items o1, Items o2) {
        return o1.cost-o2.cost;
    }
}