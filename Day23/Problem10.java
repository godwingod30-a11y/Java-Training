package Day23;

public class Problem10 {

    public int largestAltitude(int[] gain) {
        int max = 0, altitude = 0;

        for (int g : gain) {
            altitude += g;
            max = Math.max(max, altitude);
        }

        return max;
    }
}
