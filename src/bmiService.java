public class BmiService {
    public int calculate (double heightMetrs, int weightKg) {
        double bml = weightKg / (heightMetrs * heightMetrs);
        return (int) bml;
    }
}
