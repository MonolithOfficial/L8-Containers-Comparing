package ge.tbc.testautomation;

import java.util.Comparator;

public class OrderingComparator implements Comparator<Oval> {
    @Override
    public int compare(Oval o1, Oval o2) {

        return Double.compare(o1.getRadius(), o2.getRadius());
    }
}
