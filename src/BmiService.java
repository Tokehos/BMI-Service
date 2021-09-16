public class BmiService {
    public double calculate(double weight, double growth) {
            double BMI = weight / (growth * growth);
            return BMI;
        }
    }
