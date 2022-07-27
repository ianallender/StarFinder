import java.util.Comparator;

public class StarCompare implements Comparator<Star> {


    @Override
    public int compare(Star o1, Star o2) {
        return (int) (o1.distanceFromEarth - o2.distanceFromEarth);
    }
}
