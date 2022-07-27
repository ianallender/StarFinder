import java.util.ArrayList;
import java.util.List;

public class FindStars {

    public List<Star> findStars(List<Star> stars, int k) {
        List<Star> closestStars = new ArrayList<>();
        for (int i = 0; i < k;i++) {
            double minDistance = Double.MAX_VALUE;
            Star closestStar = null;
            for (Star star : stars) {
                if (closestStars.contains(star)) {
                    continue;
                }
                if (star.getDistanceFromEarth() < minDistance) {
                    minDistance = star.getDistanceFromEarth();
                    closestStar = star;
                }
            }
            closestStars.add(closestStar);
        }
        return closestStars;
    }

    public List<Star> findStars2 (List<Star> stars, int k) {
        List<Star> closestStars = new ArrayList<>(stars);
        closestStars.sort(new StarCompare());
        return closestStars.subList(0,k);
    }
}
