public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weight1 = 75; // вес человека, кг
        double growth1 = 1.80; // рост человека, м
        double BMI1 = service.calculate(weight1, growth1);
        System.out.println(BMI1);

        double weight2 = 60; // вес человека, кг
        double growth2 = 1.70; // рост человека, м
        double BMI2 = service.calculate(weight2, growth2);
        System.out.println(BMI2);

        double weight3 = 55; // вес человека, кг
        double growth3 = 1.30; // рост человека, м
        double BMI3 = service.calculate(weight3, growth3);
        System.out.println(BMI3);
    }
}
