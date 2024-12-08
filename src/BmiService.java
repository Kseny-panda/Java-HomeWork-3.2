public class BmiService {
    public int calculate (double heightMetrs, int weightKg) {
        double bmi = weightKg / (heightMetrs * heightMetrs);
        return (int) bmi;
    }
}
